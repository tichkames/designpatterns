package com.hod.creational.prototype;

abstract class BasicCar implements Cloneable{
    private String model;
    private double price = 10.00;

    public BasicCar(String model){
        this.model = model;
    }

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

class Nano extends BasicCar {

    public Nano(String model) {
        super(model);
    }
}

class Ford extends BasicCar {

    public Ford(String model) {
        super(model);
    }
}