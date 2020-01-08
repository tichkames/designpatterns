package com.hod.behavioral.mediator;

import java.util.ArrayList;

interface Mediator {
    void addBuyers(Buyer buyer);
    void findHighestBidder();
}

//Concrete mediators
class AuctionMediator implements Mediator{
    //this class implements the mediator interface and holds all the buyers
    //in an arraylist. Then we can add buyers and find the highest bidder

    private ArrayList<Buyer> buyers;

    public AuctionMediator(){
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyers(Buyer buyer) {
        this.buyers.add(buyer);
        System.out.println(buyer.getName() + " was added to buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for (Buyer b : buyers){

            if(b.getPrice() > maxBid){
                maxBid = b.getPrice();
                winner = b;
            }

            b.auctionHasEnded();
        }

        System.out.println("The auction winner is " + winner.getName() + ". They paid " + winner.getPrice());
    }
}
