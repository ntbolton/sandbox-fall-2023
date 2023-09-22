package org.example.inheritance;

public class Fish extends Amphibian {

    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Fish is making sound");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is being hunted");
    }

    @Override
    public void track() {

    }

    @Override
    public void socialize() {

    }
}
