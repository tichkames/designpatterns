package com.hod.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Broker {
    private List<OrderCommand> orders = new ArrayList<>();

    public void takeOrder(OrderCommand command){
        orders.add(command);
    }

    public void placeOrders(){
        for(OrderCommand order : orders){
            order.execute();
        }
        orders.clear();
    }
}
