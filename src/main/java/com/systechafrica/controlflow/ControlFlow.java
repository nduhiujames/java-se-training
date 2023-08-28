package com.systechafrica.controlflow;

import java.util.logging.Logger;

import com.systechafrica.operators.OperatorsDemo;

public class ControlFlow {
    private static final Logger LOGGER= Logger.getLogger(ControlFlow.class.getName());

    public void ifelseStatement(){
    

          int maths=70;
        char grade;

        if(maths>= 70){
            grade='A';
        }
        //add conditions here to assign grade variable as expected
        LOGGER.info("Student Grade ");
    }
    public void switchStatement(){
        String day="FRIDAY";
        switch(day){
            case"MONDAY":
            LOGGER.info("Monday Working Day");
            break;

            case"TUESDAY":
            LOGGER.info("Tuesday Working Day");
            break;

            case"WEDNESDAY":
            LOGGER.info("Wednesdy Working Day");
            break;

            case"THURSDAY":
            LOGGER.info("Thursday Working Day");
            break;

            case"FRIDAY":
            LOGGER.info("Friday Working Day");
            break;

             case"SATURDAY":
             case"SUNDAY":
            LOGGER.info("Sherehe ");
            break;
            default:
            LOGGER.info("please specify a valid day");

        }

    }
    public static void main(String[] args) {
        ControlFlow app= new ControlFlow();
        app.ifelseStatement();
        app.switchStatement();
      


        
    }
    
}
