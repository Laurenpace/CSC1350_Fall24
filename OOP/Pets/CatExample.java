package CSC1350_Fall24.OOP.Pets;

import java.util.Scanner;

public class CatExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Martini");
        cat.setBreed("Maine Coon");

        Cat[] cats = new Cat[2];
//        cats[0] = cat;

//        System.out.println(cats[0].getName());
        for (int i = 0; i < cats.length; i++) {
            String name = in.nextLine();
            Cat cat1 = new Cat(name, in.nextLine());
            cats[i] = cat1;
//            cats[i] = new Cat(in.nextLine(), in.nextLine());
        }
        System.out.println(cats[0].getName());
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Name: " + cats[i].getName());
        }
    }
}


