package com.hod.behavioral.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        //make the chain first: Fax then email
        Receiver faxHandler, emailHandler;

        //end of chain
        emailHandler = new EmailErrorHandler();

        //fax handler is before email
        faxHandler = new FaxErrorHandler();
        faxHandler.setNextReceiverChain(emailHandler);

        //starting point: raiser will raise issue and set the first handler
        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is late", MessagePriority.HIGH);
        Message m2 = new Message("Email not sent", MessagePriority.HIGH);
        Message m3 = new Message("In Email, BCC disabled", MessagePriority.NORMAL);
        Message m4 = new Message("Fax not reaching destination", MessagePriority.NORMAL);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
