package com.hod.behavioral.templatemethod;

//Abstract template
abstract class OrderProcessTemplate {

    public boolean isGift;

    public OrderProcessTemplate(boolean isGift){
        this.isGift = isGift;
    }

    //template method, made final so that subclasses cannot override it
    public final void processOrder(){
        doSelect();
        doPayment();
        if(isGift)
            giftWrapping();
        delivery();
    }

    private void giftWrapping() {
        System.out.println("Wrapping gift");
    }

    //methods to be implemented by subclasses
    abstract void doSelect();
    abstract void doPayment();
    abstract void delivery();
}

//Concrete classes
class NetOrder extends OrderProcessTemplate{

    public NetOrder(boolean isGift) {
        super(isGift);
    }

    @Override
    void doSelect() {
        System.out.println("NetOrder select :: shopping cart");
    }

    @Override
    void doPayment() {
        System.out.println("NetOrder payment :: credit card");
    }

    @Override
    void delivery() {
        System.out.println("NetOrder delivery :: MR Delivery");
    }
}

class StoreOrder extends OrderProcessTemplate{

    public StoreOrder(boolean isGift) {
        super(isGift);
    }

    @Override
    void doSelect() {
        System.out.println("StoreOrder select :: shelf");
    }

    @Override
    void doPayment() {
        System.out.println("StoreOrder payment :: cash");
    }

    @Override
    void delivery() {
        System.out.println("StoreOrder delivery :: trolley");
    }
}