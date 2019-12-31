package com.hod.behavioral.command;

//Command
public interface OrderCommand {
    void execute();
}

//Concrete Commands
class BuyStock implements OrderCommand {

    private StockReceiver stockReceiver;

    public BuyStock(StockReceiver stockReceiver){
        this.stockReceiver = stockReceiver;
    }

    @Override
    public void execute(){
        this.stockReceiver.buyStock();
    }
}

class SellStock implements OrderCommand {

    private StockReceiver stockReceiver;

    public SellStock(StockReceiver stockReceiver){
        this.stockReceiver = stockReceiver;
    }

    @Override
    public void execute(){
        this.stockReceiver.sellStock();
    }
}