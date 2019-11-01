package com.hod.creational.factory;

interface Animal {
    void makeSound();
}

class Tiger implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Tiger Sounds...");
    }
}

class Duck implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Duck Sounds...");
    }
}