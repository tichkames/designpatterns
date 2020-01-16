package com.hod.behavioral.state;

public class Client {
    public static void main(String[] args) {

        //Initially fone is in vibration
        Vibration vibration = new Vibration();
        AlertStateContext ctx = new AlertStateContext(vibration);

        //Show alert
        ctx.alert();
        ctx.alert();

        //Change state
        ctx.setState(new Silent());

        //Show alert
        ctx.alert();
        ctx.alert();
        ctx.alert();
    }
}
