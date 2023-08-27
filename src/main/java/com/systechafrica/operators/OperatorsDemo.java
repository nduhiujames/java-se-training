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
    private void assignmentOperators(){

        //simple assignment operator
        int quantity=35;
        //addition assignment operator
        quantity+=10;//> quantity=quantity+10
        LOGGER.info("Quantity " + quantity);

        //multiplication assignment operator
        quantity*=100;
        LOGGER.info("Quantity " + quantity);

         quantity/=20;
        LOGGER.info("Quantity " + quantity);


    }

    private void comparisonOperators(){
        int studentOneAge =20;
        int studentTwoAge =25;

        //equality
        boolean isStudentOneAgeEqualToStudentTwoAge=studentOneAge==studentTwoAge;
         LOGGER.info("isStudentOneAgeEqualToStudentTwoAge " + isStudentOneAgeEqualToStudentTwoAge);

         //inequality operator
         boolean isStudentOneAgeNotEqualToStudentTwoAge=studentOneAge!=studentTwoAge;
         LOGGER.info("isStudentOneAgeNotEqualToStudentTwoAge " + isStudentOneAgeNotEqualToStudentTwoAge);

         //inequality operator
         boolean isStudentOneAgeLessThanStudentTwoAge=studentOneAge<studentTwoAge;
         LOGGER.info("isStudentOneAgeLessThanStudentTwoAge " + isStudentOneAgeLessThanStudentTwoAge);

         //inequality operator
         boolean isStudentOneAgeGreaterThanStudentTwoAge=studentOneAge>studentTwoAge;
         LOGGER.info("isStudentOneAgeGreaterThanStudentTwoAge " + isStudentOneAgeGreaterThanStudentTwoAge);

         //LessThanEqual operator
         boolean isStudentOneAgeLessThanEqualStudentTwoAge=studentOneAge<=studentTwoAge;
         LOGGER.info("isStudentOneAgeLessThanEqualStudentTwoAge " + isStudentOneAgeLessThanEqualStudentTwoAge);

         //>= operator
         boolean isStudentOneAgeGreaterThanEqualStudentTwoAge=studentOneAge>=studentTwoAge;
         LOGGER.info("isStudentOneAgeGreaterThanEqualStudentTwoAge " + isStudentOneAgeGreaterThanEqualStudentTwoAge);

        
    }

    private void andlogicalOperator(){

        int studentOneAge=20;
        int studentTwoAge=25;

        boolean isStudentOneAllowed=studentOneAge>=18;
        boolean isStudentTwoAllowed=studentTwoAge>=18;

        // and operator
        if(isStudentOneAllowed && isStudentTwoAllowed){
          LOGGER.info("All students alllowed for ID Registration ");  
        }else{
          LOGGER.info("Not alllowed for ID Registration ");   
        }
         

    }
    private void orlogicalOperator(){

        int studentOneAge=17;
        int studentTwoAge=25;

        boolean isStudentOneAllowed=studentOneAge>=18;
        boolean isStudentTwoAllowed=studentTwoAge>=18;

        // and operator
        if(!isStudentOneAllowed || isStudentTwoAllowed){
          LOGGER.info("All students alllowed for ID Registration ");  
        }else{
          LOGGER.info("Not alllowed for ID Registration ");   
        }
         

    }
    public static void main(String[] args) {
        OperatorsDemo app=new OperatorsDemo();
        app.arithmeticOperators();
        app.assignmentOperators();
        app.comparisonOperators();
        app.andlogicalOperator();
        app.orlogicalOperator();

        
    }

    
}
