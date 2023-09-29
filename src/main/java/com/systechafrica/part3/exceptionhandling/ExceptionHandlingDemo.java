package com.systechafrica.part3.exceptionhandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result=calculator.divide(6, 0);
        System.out.println(result);
        try{
            calculator.connect();

        }catch(Exception e){
            
        }
    }
    
    
}
