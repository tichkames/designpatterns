package com.hod.behavioral.observer;

//This interface is implemented by all those classes that are to be
//updated whenever there is an update from CricketData
public interface Observer {
    void update(int runs, int wickets, float overs);
}

class AverageScoreDisplay implements Observer{
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    private void display() {
        System.out.println("Average Score Display:" +
                "\n\tRun Rate: " + runRate + "\n\tPredicated Score: " +
                predictedScore);
    }
}

class CurrentScoreDisplay implements Observer{

    private int runs, wickets;
    private float overs;
    
    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    private void display() {
        System.out.println("Current Score Display:" +
                "\n\tRuns: " + this.runs +
                "\n\tWickets: " + this.wickets +
                "\n\tOvers: " +this.overs);
    }
}
