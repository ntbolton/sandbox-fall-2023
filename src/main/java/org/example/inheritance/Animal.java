package org.example.inheritance;

public abstract class Animal implements Huntable {

    private String name;
    protected boolean breathing;

    protected Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void eat() {
        System.out.println("animal eating");
    }

    public void makeSound() {
        System.out.println("animal making sound");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
