package com.hod.structural.facade;

public class Client {
    public static void main(String[] args) {
        HotelKeeperFacade hotelKeeperFacade = new HotelKeeperFacade();

        Menus menus = hotelKeeperFacade.getVegMenu();
        menus.showMenu();

        menus = hotelKeeperFacade.getNonVegMenu();
        menus.showMenu();

        menus = hotelKeeperFacade.getBothMenu();
        menus.showMenu();
    }
}
