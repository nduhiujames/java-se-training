package com.systechafrica.part2.abstactclasses;

public abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void makeSound();
    public void eat(){

        System.out.println(name+ "is eating");
    }
    
}
