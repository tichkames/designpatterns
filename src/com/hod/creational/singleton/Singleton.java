package com.hod.creational.singleton;

public class Singleton {

    //instance attribute
    private int data = 0;

    //private so no client can instantiate an object
    private Singleton(){}

    //we force every thread to wait its turn before it can enter the method
    public static Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    //Nested class referenced after the getInstance() is called
    private static class SingletonHelper{
        private static final Singleton uniqueInstance = new Singleton();
    }
}