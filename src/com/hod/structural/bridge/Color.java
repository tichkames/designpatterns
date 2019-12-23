package com.hod.structural.bridge;

//implementer
interface Color {
    void fill(int border);
}

//bridge abstraction
abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void drawShape(int border);
    public abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

    public Triangle(Color color){
        super(color);
    }

    public void drawShape(int border){
        System.out.println("Drawing Triangle");
        color.fill(border);
    }

    public void modifyBorder(int border, int increment){
        System.out.println("Modifying Triangle");
        drawShape(border + increment);
    }
}

class Rectangle extends Shape {

    public Rectangle(Color color){
        super(color);
    }

    public void drawShape(int border){
        System.out.println("Drawing Rectangle");
        color.fill(border);
    }

    public void modifyBorder(int border, int increment){
        System.out.println("Modifying Rectangle");
        drawShape(border + increment);
    }
}

class RedColor implements Color {
    @Override
    public void fill(int border){
        System.out.println(String.format("Fill with RedColor with border %d ", border));
    }
}

class GreenColor implements Color {
    @Override
    public void fill(int border){
        System.out.println(String.format("Fill with GreenColor with border %d ", border));
    }
}