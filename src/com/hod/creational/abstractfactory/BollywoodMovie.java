package com.hod.creational.abstractfactory;

interface BollywoodMovie {
    void show();
}

class BollywoodActionMovie implements BollywoodMovie{
    @Override
    public void show(){
        System.out.println("Now showing BollywoodActionMovie...");
    }
}

class BollywoodComedyMovie implements BollywoodMovie{
    @Override
    public void show(){
        System.out.println("Now showing BollywoodComedyMovie...");
    }
}