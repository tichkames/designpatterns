package com.hod.structural.facade;

public class HotelKeeperFacade {

    public Menus getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return nonVegRestaurant.getMenus();
    }

    public Menus getVegMenu(){
        VegRestaurant vegRestaurant = new VegRestaurant();
        return vegRestaurant.getMenus();
    }

    public Menus getBothMenu(){
        VegNonBothRestaurant vegNonBothRestaurant = new VegNonBothRestaurant();
        return vegNonBothRestaurant.getMenus();
    }
}
