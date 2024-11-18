package CSC1350_Fall24.OOP;

import CSC1350_Fall24.OOP.Pets.Dog; //imports Dog class

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer > integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(5);
        integerArrayList.add(5);
        integerArrayList.add(5);
        integerArrayList.add(5);
        integerArrayList.add(5);
        integerArrayList.add(5);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Fido", 3,"Doberman"));
        dogs.add( new Dog("Woof", 1, "Husky"));

        for (Dog d : dogs) {
            System.out.println(d.getName());
        }

    }
}
