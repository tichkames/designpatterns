package com.hod.structural.flyweight;

//client
public class CounterStrike {
    public static void main(String[] args) {
        PlayerFactory playerFactory = new PlayerFactory();
        Player terrorist = playerFactory.getPlayer("terrorist");
        terrorist.mission();
        terrorist.assignWeapon("chemical compound");

        Player counterTerrorist = playerFactory.getPlayer("counter_terrorist");
        counterTerrorist.mission();
        counterTerrorist.assignWeapon("bomb diffuser");

        terrorist = playerFactory.getPlayer("terrorist");
        terrorist.mission();
        terrorist.assignWeapon("nuclear");

        counterTerrorist = playerFactory.getPlayer("counter_terrorist");
        counterTerrorist.mission();
        counterTerrorist.assignWeapon("EMP");
    }
}
