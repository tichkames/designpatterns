package com.hod.behavioral.command;

//Receiver
public interface StockReceiver {
    void buyStock();
    void sellStock();
}

class Stock implements StockReceiver {
    private String name;
    private int quantity;

    public Stock(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public void buyStock(){
        System.out.println(String.format("Buying stock %s with quantity of %d", name, quantity));
    }

    @Override
    public void sellStock(){
        System.out.println(String.format("Selling stock %s with quantity of %d", name, quantity));
    }
}