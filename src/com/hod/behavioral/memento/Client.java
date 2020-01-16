package com.hod.behavioral.memento;

public class Client {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("MobileAlertState #1");
        originator.setState("MobileAlertState #2");
        caretaker.add(originator.saveState());

        originator.setState("MobileAlertState #3");
        caretaker.add(originator.saveState());

        originator.setState("MobileAlertState #4");
        System.out.println("Current MobileAlertState" + originator.getState());

        //start restoring states
        originator.restoreState(caretaker.get(0));
        System.out.println("Restored first saved state: " + originator.getState());

        //show current state
        System.out.println("Current MobileAlertState: " + originator.getState());
    }
}
