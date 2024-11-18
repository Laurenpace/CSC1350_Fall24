//
package CSC1350_Fall24.OOP.Pets;

public class Cat {
    private String name;
    private String breed;
    private boolean isFluffy;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Cat(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    public void setFluffy(boolean fluffy) {
        isFluffy = fluffy;
    }
}
//Cat cat = new Cat();