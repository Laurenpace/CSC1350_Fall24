package CSC1350_Fall24.OOP.Pets;



public class Dog {
    private String name;
    private int age;
    private String breed;
    public static int numberOfDogs;


    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        numberOfDogs++;
    }

    public Dog(String BREED, int age) {
        breed = BREED;
        this.age = age;
        numberOfDogs++;

    }


    public Dog() {
        numberOfDogs++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void print(){
        System.out.println(name + age + breed);
    }
}