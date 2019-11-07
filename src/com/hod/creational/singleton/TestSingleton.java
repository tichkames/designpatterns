package com.hod.creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        s.setData(5);
        System.out.println(String.format("data: %d", s.getData()));

        s = null;
        s = Singleton.getInstance();
        System.out.println(String.format("data: %d", s.getData()));
    }
}
