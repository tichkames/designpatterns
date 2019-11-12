package com.hod.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    void addItem(Item item){
        items.add(item);
    }

    void getCost(){
        float total = 0f;
        for (Item item: items) {
            total += item.getPrice();
        }
        System.out.println(String.format("total cost: %s", total));
    }

    void showItems(){
        for (Item item: items) {
            System.out.println(String.format("\titem: %s", item.getName()));
            System.out.println(String.format("\tpackaged in %s", item.getPackageType().pack()));
            System.out.println(String.format("\titem price: %.2f", item.getPrice()));
        }
    }
}

interface MealBuilder{
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}

class VegMealBuilder implements MealBuilder{

    Meal meal = new Meal();
    public String drinkType;

    public VegMealBuilder(String drinkType){
        this.drinkType = drinkType;
    }

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {

        if(drinkType.equalsIgnoreCase("coke")){
            meal.addItem(new Coke());
        }else{
            meal.addItem(new Pepsi());
        }
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}

class NonVegMealBuilder implements MealBuilder {

    Meal meal = new Meal();
    public String drinkType;

    public NonVegMealBuilder(String drinkType){
        this.drinkType = drinkType;
    }

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        if(drinkType.equalsIgnoreCase("coke")){
            meal.addItem(new Coke());
        }else{
            meal.addItem(new Pepsi());
        }
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}