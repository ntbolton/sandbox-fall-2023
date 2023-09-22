package org.example.inheritance;

import java.util.List;
import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {

        Animal animal1 = new Fish();
        Animal animal2 = new Frog();
        Huntable animal3 = new Fish();

        List<Huntable> animals = new ArrayList<>();

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        animals.forEach(animal ->  {
            animal.hunt();                 // polymorphism
            if (animal instanceof Animal) {
                ((Animal)animal).eat();   // polymorphism & wrapping
            }
        });




    }


}
