package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        com.timbuchalka.Animal animal = new com.timbuchalka.Animal("Animal", 1, 1, 5, 5);

        com.timbuchalka.Dog dog = new com.timbuchalka.Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
//        dog.eat();
        dog.walk();
//        dog.run();

    }
}
