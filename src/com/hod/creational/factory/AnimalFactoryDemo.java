package com.hod.creational.factory;

public class AnimalFactoryDemo {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("tiger");
        animal1.makeSound();
    }
}
