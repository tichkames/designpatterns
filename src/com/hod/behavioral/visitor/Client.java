package com.hod.behavioral.visitor;

import java.util.ArrayList;

public class Client {

    //normal shopping cart stuff
    private static ArrayList<Visitable> items = new ArrayList<>();

    public static double calculatePostage(Visitor visitor){
        //iterate through all items
        for (Visitable item : items){
            item.accept(visitor);
        }
        double postage = visitor.getTotalPostage();
        return postage;
    }

    public static void main(String[] args) {

        //create a bunch of visitors (Book, CD, DVD)
        Visitable myBook = new Book(8.52, 1.05);
        Visitable myCD = new CD(18.52, 3.05);
        Visitable myDvd = new DVD(6.53, 4.02);

        //add each visitor to the array list
        items.add(myBook);
        items.add(myCD);
        items.add(myDvd);

        Visitor visitor = new USPostgaeVisitor();
        double myPostage = calculatePostage(visitor);
        System.out.println(String.format("The total postage for items shipped to the US is: " + myPostage));

        visitor = new SouthAmericaPostgaeVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println(String.format("The total postage for items shipped to South America: " + myPostage));
    }
}
