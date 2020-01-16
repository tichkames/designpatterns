package com.hod.behavioral.state;

//AlertStateContext
public class AlertStateContext {
    private MobileAlertState state;

    public AlertStateContext(MobileAlertState state){
        this.state = state; //Default state passed from client
    }

    public void setState(MobileAlertState state) {
        this.state = state;
    }

    public void alert(){
        state.alert(this);
    }
}
