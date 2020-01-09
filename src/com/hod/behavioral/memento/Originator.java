package com.hod.behavioral.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //save state
    public Memento saveState(){
        return new Memento(state);
    }

    //restore state
    public void restoreState(Memento memento){
        state = memento.getState();
    }
}
