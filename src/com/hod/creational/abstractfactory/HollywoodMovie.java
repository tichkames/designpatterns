package com.hod.creational.abstractfactory;

public interface HollywoodMovie {
    void show();
}

class HollywoodActionMovie implements HollywoodMovie{
    @Override
    public void show(){
        System.out.println("Now showing HollywoodActionMovie...");
    }
}

class HollywoodComedyMovie implements HollywoodMovie{
    @Override
    public void show(){
        System.out.println("Now showing HollywoodComedyMovie...");
    }
}