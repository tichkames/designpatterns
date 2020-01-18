package com.hod.behavioral.templatemethod;

public class Client {

    public static void main(String[] args) {
        OrderProcessTemplate orderType = new NetOrder(true);

        //using template method
        orderType.processOrder();

        orderType = new StoreOrder(false);

        //using template method
        orderType.processOrder();
    }
}
