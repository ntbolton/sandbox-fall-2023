package org.example.inheritance;

public class Zookeeper {
    public static void main(String[] args) {

        Animal animal = new Frog();
        Animal animal2 = new Fish();
        Animal animal3 = new Frog("Frog");

        animal.eat();
        animal.makeSound();
        animal2.eat();
        animal2.makeSound();

        System.out.println(animal instanceof Frog);
        System.out.println(animal2 instanceof Animal);

        animal.setName("Frog");
        animal2.setName("Fish");


        System.out.println(animal.getName());
        System.out.println(animal2.getName());
    }
}
