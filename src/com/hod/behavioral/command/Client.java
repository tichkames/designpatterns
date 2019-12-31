package com.hod.behavioral.command;

//Client
public class Client {

    public static void main(String[] args) {

        //create receiver
        StockReceiver stock1 = new Stock("MTN", 5);
        StockReceiver stock2 = new Stock("Discovery", 10);

        //create the command with the associating receiver
        BuyStock buyStock = new BuyStock(stock1);
        SellStock sellStock = new SellStock(stock2);

        //create the invoker and associate it with the command
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        //execute the orders
        broker.placeOrders();
    }
}
