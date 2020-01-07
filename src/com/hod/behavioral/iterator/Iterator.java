package com.hod.behavioral.iterator;

import java.util.LinkedList;

public interface Iterator {
    //reset to first element
    void first();

    //get next element
    String next();

    //end of collection check
    boolean isDone();

    //retrieve current item
    String currentItem();
}

//Concrete iterators
class ArtsIterator implements Iterator {
    private String[] subjectList;
    private int currentPos;

    public ArtsIterator(String[] subjectList){
        this.subjectList = subjectList;
        this.currentPos = 0;
    }

    @Override
    public void first() {
        this.currentPos = 0;
    }

    @Override
    public String next() {
        return subjectList[currentPos++];
    }

    @Override
    public boolean isDone() {
        return currentPos >= subjectList.length;
    }

    @Override
    public String currentItem() {
        return subjectList[currentPos];
    }
}

class ScienceIterator implements Iterator {
    private LinkedList<String> subjectList;
    private int currentPos;

    public ScienceIterator(LinkedList<String> subjectList){
        this.subjectList = subjectList;
        this.currentPos = 0;
    }

    @Override
    public void first() {
        this.currentPos = 0;
    }

    @Override
    public String next() {
        return subjectList.get(currentPos++);
    }

    @Override
    public boolean isDone() {
        return currentPos >= subjectList.size();
    }

    @Override
    public String currentItem() {
        return subjectList.get(currentPos);
    }
}