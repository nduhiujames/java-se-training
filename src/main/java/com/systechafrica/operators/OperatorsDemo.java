package com.systechafrica.operators;

import java.util.logging.Logger;


public class OperatorsDemo {
    private static final Logger LOGGER= Logger.getLogger(OperatorsDemo.class.getName());

    private void arithmeticOperators(){
       
        int studentOneAge=21;
        int studentTwoAge=19;

         //addition operator
        int totalClassAge=studentOneAge+studentTwoAge;
        LOGGER.info("Total Class Age " + totalClassAge);

        //subtraction operator
        int ageDifference=studentOneAge-studentTwoAge;
        LOGGER.info("Age difference " + ageDifference);

        //product of class ages
        int ageProduct=studentOneAge*studentTwoAge;
        LOGGER.info("Age Product " + ageProduct);

        //Division Operator
        int divisionResults=studentOneAge/studentTwoAge;
        LOGGER.info("Division " + divisionResults);
        //
        double divisionResultsDouble=(double)studentOneAge/studentTwoAge;
        LOGGER.info("Division " + divisionResultsDouble);
        //modulus
        int modulusResults=studentOneAge % studentTwoAge;
        LOGGER.info("Modulus " + modulusResults);

        
    }


    public static void main(String[] args) {
        OperatorsDemo app=new OperatorsDemo();
        app.arithmeticOperators();

        
    }
    
}