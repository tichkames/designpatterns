package com.hod.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        AuctionMediator mediator = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(mediator, "Jason");
        Buyer b2 = new AuctionBuyer(mediator, "Ian");
        Buyer b3 = new AuctionBuyer(mediator, "Myra");

        //Create and add buyers
        mediator.addBuyers(b1);
        mediator.addBuyers(b2);
        mediator.addBuyers(b3);

        System.out.println("Waiting for buyer's offers...");

        //making bids
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("--------");

        mediator.findHighestBidder();

        b2.cancelBid();
        System.out.println(b2.getName() + " has cancelled their bid!");

        mediator.findHighestBidder();
    }
}
