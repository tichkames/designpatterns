package com.hod.behavioral.iterator;

public class Client {

    static void print(Iterator it){
        while(!it.isDone()){
            System.out.println(String.format("Science subject: %s", it.next()));
        }
    }

    public static void main(String[] args) {

        SubjectCollection scienceSubs = new ScienceSubjectCollection();
        SubjectCollection artsSubs = new ArtsSubjectCollection();

        Iterator scienceIterator = scienceSubs.createIterator();
        Iterator artsIterator = artsSubs.createIterator();
        print(scienceIterator);
        print(artsIterator);
    }
}
