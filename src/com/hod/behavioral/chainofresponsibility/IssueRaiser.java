package com.hod.behavioral.chainofresponsibility;

public class IssueRaiser {
    public Receiver firstReceiver;

    public IssueRaiser(Receiver firstReceiver){
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message message){
        if(firstReceiver != null){
            firstReceiver.processMessage(message);
        }
    }
}
