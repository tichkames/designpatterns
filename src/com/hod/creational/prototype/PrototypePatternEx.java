package com.hod.creational.prototype;

import java.util.Hashtable;

public class PrototypePatternEx {
    public static void main(String[] args) {
        BasicCarCache.loadCarCache();

        BasicCar car = BasicCarCache.getCar("figo");
        car.setPrice(150.50);
        System.out.println(String.format("Ford %s costs R%.2f", car.getModel(), car.getPrice()));

        car = BasicCarCache.getCar("speedster");
        System.out.println(String.format("Nano %s costs R%.2f", car.getModel(), car.getPrice()));
    }
}

class BasicCarCache{

    private static Hashtable<String, BasicCar> carCache = new Hashtable<>();

    public static BasicCar getCar(String model){
        BasicCar cachedCar = carCache.get(model);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCarCache(){
        Nano nano = new Nano("speedster");
        nano.setPrice(30.05);
        carCache.put(nano.getModel(), nano);

        Ford ford = new Ford("figo");
        ford.setPrice(50.05);
        carCache.put(ford.getModel(), ford);
    }
}