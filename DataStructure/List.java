package DataStructure;

import java.util.ArrayList;

public class List<I extends Number> {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");
        System.out.println(list.get(1));

        list.remove("Banana");
        System.out.println(list.get(1));

        list.add(0,"Blueberry");
        list.set(0, "Strawberry");
    }
}
