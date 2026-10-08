// RunTimePolymorphism.java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {

        // Parent class reference, child class objects
        Animal animal;

        animal = new Dog();
        animal.sound();   // Dog's sound() is called

        animal = new Cat();
        animal.sound();   // Cat's sound() is called
    }
}