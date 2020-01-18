package com.hod.behavioral.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
    double getTotalPostage();
}

//concrete visitor
class USPostgaeVisitor implements Visitor {
    private double totalPostageForCart = 0;

    //collect data about the book
    @Override
    public void visit(Book book) {
        //assume we have a calculation here related to weight and price,
        //free postage for a book over $20
        if(book.getPrice() < 20.0){
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 20.0){
            totalPostageForCart += cd.getWeight() * 2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice() < 20.0){
            totalPostageForCart += dvd.getWeight() * 3;
        }
    }

    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}

class SouthAmericaPostgaeVisitor implements Visitor {
    private double totalPostageForCart = 0;

    //collect data about the book
    @Override
    public void visit(Book book) {
        //assume we have a calculation here related to weight and price,
        //free postage for a book over $30
        if(book.getPrice() < 30){
            totalPostageForCart += (book.getWeight() * 2) * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 30){
            totalPostageForCart += (cd.getWeight() * 2.5) * 2;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice() < 30){
            totalPostageForCart += (dvd.getWeight() * 3) * 2;
        }
    }

    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}