package com.hod.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//Flyweight Interface
public interface Player {
    void mission();

    //extrinsic data
    void assignWeapon(String weapon);
}

//Concrete flyweights
class Terrorist implements Player {
    //intrinsic state
    private String task;

    public Terrorist(String task){
        this.task = task;
    }

    //extrinsic state is passed in from client
    public void assignWeapon(String weapon){
        System.out.println(String.format("Terrorist | mission: %s | weapon: %s", task, weapon));
    }

    public void mission(){
        System.out.println(String.format("Terrorist | mission %s", task));
    }
}

//Concrete flyweights
class CounterTerrorist implements Player {
    //intrinsic state
    private String task;

    public CounterTerrorist(String task){
        this.task = task;
    }

    //extrinsic state is passed in from client
    public void assignWeapon(String weapon){
        System.out.println(String.format("CounterTerrorist | mission: %s | weapon: %s", task, weapon));
    }

    public void mission(){
        System.out.println(String.format("CounterTerrorist | mission %s", task));
    }
}

//Concrete Factory
class PlayerFactory{
    Map<String, Player> players = new HashMap<>();

    public Player getPlayer(String type){

        Player myPlayer = null;
        if(players.containsKey(type)){
            myPlayer = players.get(type);

        }else {
            switch (type) {

                case "terrorist":
                    myPlayer = new Terrorist("plant bomb");
                    System.out.println("New Terrorist created");
                    break;

                case "counter_terrorist":
                    myPlayer = new CounterTerrorist("diffuse bomb");
                    System.out.println("New CounterTerrorist created");
                    break;
            }

            players.put(type, myPlayer);
        }
        return myPlayer;
    }
}
