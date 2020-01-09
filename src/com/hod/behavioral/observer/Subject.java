package com.hod.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;

//Implemented by CricketData to communicate with observers
public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}

//Concrete subject
class CricketData implements Subject {
    private int runs;
    private int wickets;
    private float overs;

    ArrayList<Observer> observerList;

    public CricketData(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        if(o == null){
            throw new NullPointerException("Null Observer");
        }

        if(!observerList.contains(o)){
            observerList.add(o);
        }
    }

    @Override
    public void unregisterObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
    }

    //get latest runs
    public int getRuns() {
        return 90;
    }

    //get latest wickets
    public int getWickets() {
        return 2;
    }

    //get latest overs
    public float getOvers() {
        return 10.2f;
    }

    //This method is used to update displays when data changes
    public void dataChanged(){
        this.runs = getRuns();
        this.wickets = getWickets();
        this.overs = getOvers();

        notifyObservers();
    }
}