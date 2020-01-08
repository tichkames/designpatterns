package com.hod.behavioral.mediator;

//Colleague interface
public abstract class Buyer {
    //this class holds the buyer
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelBid();
    public abstract void auctionHasEnded();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

//Concrete colleagues
class AuctionBuyer extends Buyer {

    public AuctionBuyer(Mediator mediator, String name){
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelBid() {
        this.price = -1;
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("Received message auction has ended: " + this.name);
    }
}