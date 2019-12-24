package com.hod.structural.decorator;

//component interface
interface Shape {
    void draw();
}

//concrete components - what you want to add additional functionality to
class Rectangle implements Shape {

    @Override
    public void draw(){
        System.out.println("Shape: Rectangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Shape: Circle");
    }
}

//decorator interface
abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        if(decoratedShape != null){
            decoratedShape.draw();
        }
    }
}

//concrete decorators
class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw(){
        super.draw();

        //additional responsibilities
        System.out.println("Border: Red, extension");
    }
}

class GreenShapeDecorator extends ShapeDecorator{

    public GreenShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw(){

        System.out.println("Border: Green, extension");
        super.draw();

        //additional responsibilities
        System.out.println("Style: Green, extension");
    }
}
