package com.qa.starterproject;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {
	private List<Dogs> dogs = new ArrayList<>();
	


@GetMapping("/Dogs")

public Dogs getDemoDogs() {
	return new Dogs("Tyson", "Pitbull", Integer.MAX_VALUE);
}
@PostMapping("/CreateDogs")
public Dogs create(@RequestBody Dogs dog) {
	System.out.println("created: " + dog);
	this.dogs.add(dog);
	return this.dogs.get(this.dogs.size() - 1);
}
@PatchMapping("/updateDogs/{id}")
public void update(@PathVariable("id") int id, @PathParam("name") String name, @PathParam("species") String species,
        @PathParam("age") int age) {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Species: " + species);
    System.out.println("Age: " + age);
}

@DeleteMapping("/removeDogs/{id}")
public void delete(@PathVariable int id) {
    System.out.println("ID: " + id);
}
}
