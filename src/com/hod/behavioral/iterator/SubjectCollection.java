package com.hod.behavioral.iterator;

import java.util.LinkedList;

//Aggregate interface
public interface SubjectCollection {
    Iterator createIterator();
}

//Concrete aggregates
class ArtsSubjectCollection implements SubjectCollection {
    String[] subjectList;
    final static int MAX_ITEMS = 3;
    int numberOfItems = 0;

    public ArtsSubjectCollection(){
        this.subjectList = new String[MAX_ITEMS];

        addItems("English");
        addItems("Drama");
        addItems("Home and Economics");
    }

    private void addItems(String subject){
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Collection full");
        }else{
            subjectList[numberOfItems] = subject;
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjectList);
    }
}

class ScienceSubjectCollection implements SubjectCollection {
    LinkedList<String> subjectList;
    final static int MAX_ITEMS = 3;

    public ScienceSubjectCollection(){
        this.subjectList = new LinkedList<>();

        addItems("Biology");
        addItems("Physics");
        addItems("Chemistry");
    }

    private void addItems(String subject){
        if(subjectList.size() >= MAX_ITEMS){
            System.out.println("Collection full");
        }else{
            subjectList.add(subject);
        }
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjectList);
    }
}