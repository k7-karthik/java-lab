class Animal {
    void bark() {
        System.out.println("Animal is barking...");
    }
}

class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Animal a = new Dog();   // Dynamic Binding
        a.bark();
    }
}