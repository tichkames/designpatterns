package com.hod.behavioral.visitor;

//to be used in the collection
public interface Visitable {
    void accept(Visitor visitor);
}

//Concrete elements
class Book implements Visitable {
    private double price;
    private double weight;

    public Book(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}

class CD implements Visitable {
    private double price;
    private double weight;

    public CD(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}

class DVD implements Visitable {
    private double price;
    private double weight;

    public DVD(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}