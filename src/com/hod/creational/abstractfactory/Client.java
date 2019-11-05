package com.hod.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory actionMovies = FactoryProducer.getFactory("Action");

        HollywoodMovie movie1 = actionMovies.getHollywoodMovie();

        movie1.show();

        AbstractFactory comedyMovies = FactoryProducer.getFactory("Comedy");

        BollywoodMovie movie2 = comedyMovies.getBollywoodMovie();

        movie2.show();
    }
}
