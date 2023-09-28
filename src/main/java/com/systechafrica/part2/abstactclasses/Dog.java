package com.systechafrica.part2.abstactclasses;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
        }
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        super.eat();
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
        
    }
    
}
