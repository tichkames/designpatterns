package com.hod.creational.builder;

public class Director {

    MealBuilder myBuilder;

    public void construct(MealBuilder builder){
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}

class Client{
    public static void main(String[] args) {
        Director director = new Director();

        System.out.println("Non Veg Meal");
        MealBuilder chickenBurgerBuilder = new NonVegMealBuilder("coke");
        director.construct(chickenBurgerBuilder);

        Meal meal = chickenBurgerBuilder.getMeal();
        meal.showItems();
        meal.getCost();
    }
}