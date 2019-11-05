package com.hod.creational.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("Action")){
            return new ActionMovieFactory();
        }else if(type.equalsIgnoreCase("Comedy")){
            return new ComedyMovieFactory();
        }

        return null;
    }
}
