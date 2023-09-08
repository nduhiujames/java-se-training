package com.systechafrica.part2;

public class ClassesDemo {
    public static void main(String[] args) {
        ClassesDemo app = new ClassesDemo();
        app.interns();
        app.Calculator();

    }
    public void Calculator(){
        Calculator calculator=new Calculator();
        calculator.displayWelcomeMessage();
        int result=calculator.add(5, 3);
        System.out.println("The sum is: "+result);

    }

    public void interns() {
        Intern james = new Intern();
        james.name = "James";
        james.email = "";
        james.phoneNumber = "";
        james.doAssignment();
        james.attendClass();

        Intern kinuthia = new Intern();
        kinuthia.name = "Nganuthia";
        kinuthia.email = "";
        kinuthia.phoneNumber = "";
        kinuthia.doAssignment();
        kinuthia.attendClass();

    }

    public void carInstances() {
        Car forester = new Car();
        forester.color = "black";
        forester.speed = 60;

        // drive
        forester.startEngine();
        forester.accelerate();

        Car mercedes = new Car();
        mercedes.color = "white";
        mercedes.speed = 80;

        // drive
        mercedes.startEngine();
        mercedes.accelerate();

    }

}
