package CSC1350_Fall24.OOP;

import CSC1350_Fall24.OOP.Pets.Dog;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12};
        for (int i : arr){
            System.out.println(i); //same as arr[i];
        }

        Dog d = new Dog("Fido", 3,"Doberman");
        Dog d1 = new Dog("Woof", 1, "Husky");
        Dog[] dogs = new Dog[2];
        dogs[0] = d;
        dogs[1] = d1;
        for (Dog dog : dogs){
            System.out.println(dog.getName());
        }
    }
}
