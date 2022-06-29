package Tests;

import java.util.ArrayList;
import java.util.LinkedList;

public class  app {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Bmw");
		cars.add("Mercedes");
		cars.add("Audi");
		cars.add("Volkswagen");
		
		System.out.println(cars);
		
		var fuel = new LinkedList<String>();
		
		fuel.add("Petrol");
		fuel.add("Diesel");
		fuel.add("Electric");
		
		System.out.println(fuel);
		
	}

}
