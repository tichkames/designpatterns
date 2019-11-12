package com.hod.creational.builder;

public interface Item {
    String getName();
    float getPrice();
    Packing getPackageType();
}

interface Packing{
    String pack();
}

abstract class Burger implements Item {
    @Override
    public Packing getPackageType(){
        return new Wrapper();
    }
}

abstract class Drink implements Item {
    @Override
    public Packing getPackageType(){
        return new Bottle();
    }
}

class VegBurger extends Burger {

    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return 3.0f;
    }
}

class ChickenBurger extends Burger{

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public float getPrice() {
        return 5.0f;
    }
}

class Pepsi extends Drink {

    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public float getPrice() {
        return 2.5f;
    }
}

class Coke extends Drink {

    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public float getPrice() {
        return 3.0f;
    }
}

class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}