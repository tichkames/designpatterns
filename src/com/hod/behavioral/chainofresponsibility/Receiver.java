package com.hod.behavioral.chainofresponsibility;

//Chain
public interface Receiver {
    void setNextReceiverChain(Receiver nextReceiverChain);
    boolean processMessage(Message message);
}

//concrete handlers
class EmailErrorHandler implements Receiver {
    private Receiver nextReceiverChain;

    @Override
    public void setNextReceiverChain(Receiver nextReceiverChain){
        this.nextReceiverChain = nextReceiverChain;
    }

    @Override
    public boolean processMessage(Message message){
        if(message.getMessage().indexOf("Email") != -1){
            System.out.println(String.format("Handling email message %s with priority %s", message.getMessage(), message.getPriority()));
            return true;

        }else{
            if(this.nextReceiverChain != null)
                this.nextReceiverChain.processMessage(message);
        }
        return false;
    }
}

class FaxErrorHandler implements Receiver {
    private Receiver nextReceiverChain;

    @Override
    public void setNextReceiverChain(Receiver nextReceiverChain){
        this.nextReceiverChain = nextReceiverChain;
    }

    @Override
    public boolean processMessage(Message message){
        if(message.getMessage().indexOf("Fax") != -1){
            System.out.println(String.format("Handling fax message %s with priority %s", message.getMessage(), message.getPriority()));
            return true;

        }else{
            if(this.nextReceiverChain != null)
                this.nextReceiverChain.processMessage(message);
        }
        return false;
    }
}