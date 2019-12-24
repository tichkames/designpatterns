package com.hod.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();

        rectangle.draw();

        ShapeDecorator redShapeDecorator = new RedShapeDecorator(rectangle);
        redShapeDecorator.draw();

        Shape circle = new Circle();

        ShapeDecorator greenShapeDecorator = new GreenShapeDecorator(circle);
        greenShapeDecorator.draw();
    }
}
