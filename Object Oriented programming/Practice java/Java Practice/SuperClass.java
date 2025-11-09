class Animal {
    String name1, name2, name3;

    Animal() {
        name1 = "Herbivore";
        name2 = "Omnivore";
        name3 = "Carnivore";
    }
}

class Dog extends Animal {
    String sound;

    Dog() {
        System.out.println("Dog Child class ");
        sound = "Barking";
    }

    void DogSound(String sound) {
        this.sound = sound;
    }
}

class Cat extends Animal {
    String sound;

    Cat() {
        System.out.println("Cat Child class ");
        sound = "Mew Mew";
    }

    void CatSound(String sound) {
        this.sound = sound;
    }
}

public class SuperClass {
    public static void main(String args[]) {
        Dog dog = new Dog();
    }
}
