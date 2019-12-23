package com.hod.structural.bridge;

public class Client {

    public static void main(String[] args) {
        Color color = new RedColor();
        Shape shape1 = new Triangle(color);
        shape1.drawShape(3);
        shape1.modifyBorder(3,5);

        Color color2 = new GreenColor();
        Shape shape2 = new Rectangle(color2);
        shape2.drawShape(10);
        shape2.modifyBorder(10,5);
    }
}
