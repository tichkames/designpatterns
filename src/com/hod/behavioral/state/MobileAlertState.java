package com.hod.behavioral.state;

//MobileAlertState interface
public interface MobileAlertState {
    void alert(AlertStateContext ctx);
}

//Concrete state class
class Vibration implements MobileAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        ctx.setState(new Vibration());
        System.out.println("Fone is in Vibration");
    }
}

class Silent implements MobileAlertState {

    @Override
    public void alert(AlertStateContext ctx) {
        ctx.setState(new Silent());
        System.out.println("Fone is in Silent");
    }
}