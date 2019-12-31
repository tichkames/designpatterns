package com.hod.behavioral.chainofresponsibility;

enum MessagePriority{
    NORMAL,
    HIGH
}

public class Message {
    private String message;
    private MessagePriority priority;

    public Message(String message, MessagePriority priority){
        this.message = message;
        this.priority = priority;
    }

    public String getMessage(){
        return message;
    }

    public MessagePriority getPriority(){
        return priority;
    }
}
