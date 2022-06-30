package Tests;

import java.util.ArrayList;

public class Lambda{

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("K");
        arrayList.add("H");
        arrayList.add("A");
        arrayList.add("N");

        arrayList.forEach(n -> System.out.println(n));
    }

}