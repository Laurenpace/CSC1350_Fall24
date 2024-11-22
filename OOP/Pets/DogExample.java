package CSC1350_Fall24.OOP.Pets;

import java.util.ArrayList;

public class DogExample {
    public static void main(String[] args) {
       Dog dog1 = new Dog();
       Dog dog2 = new Dog();
       dog1.setName("Balto");
       System.out.println(dog1.getName());
       dog2.setName("Fido");
       System.out.println(dog2.getName());
        System.out.println("numDogs " + Dog.numberOfDogs);
        Dog dog3 = new Dog("Spot", 4);
        System.out.println(dog3.getAge());
        dog3.print();
        System.out.println("numDogs " + Dog.numberOfDogs);

    }
}



