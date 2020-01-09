package com.hod.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        //Create Observers
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        //Create Subject
        //pass the display to CricketData
        CricketData cricketData = new CricketData();

        //register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        //in real app you would have some logic to call this function when data changes
        cricketData.dataChanged();

        //remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        //now only currentScoreDisplay gets the notification
        cricketData.dataChanged();
    }
}
