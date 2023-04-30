package codes.OOPs.polymorphism;
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class DynamicPolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1= new Animal();
        animal1.makeSound();
        animal.makeSound();
    }
}
