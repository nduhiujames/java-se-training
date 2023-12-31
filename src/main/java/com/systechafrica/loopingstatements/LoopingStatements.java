package com.systechafrica.loopingstatements;

import java.util.logging.Logger;

import com.systechafrica.operators.OperatorsDemo;

public class LoopingStatements {
    private static final Logger LOGGER= Logger.getLogger(LoopingStatements.class.getName());

    public void forLoop(){
        for( int counter =0; counter <=10; counter = counter + 1){
            LOGGER.info("Count " + counter);

       }

       for( int counter =0; counter <=10; counter = counter += 1){
            LOGGER.info("Count " + counter);

       }
       for( int counter =0; counter <=10; counter = counter++){
            LOGGER.info("Count " + counter);

       }


    }
    public void whileLoop(){
        int studentCount=0;
        while (studentCount<10){
            LOGGER.info("Student Count= " + studentCount);
            studentCount++;

        }
        
        }
    public void doWhileLoop(){

        int studentCount = 0;
        do{
            LOGGER.info("Student Count = " + studentCount);
            studentCount++;
        } while (studentCount <= 10);
        }
    public void breakJumpStatements(){
        LOGGER.info("Before my loop ");
        for (int index =0; index < 10; index++){
            if (index == 5){
                break;
            }
            LOGGER.info("My index is"+ index);
        }
        LOGGER.info("After my loop ");

}
    public void continueJumpStatements(){
         LOGGER.info("Before my loop ");
        for (int index =0; index < 10; index++){
            if (index == 5){
                continue;
            }
            LOGGER.info("My index is"+ index);
        }
        LOGGER.info("After my loop ");

    }
    public void returnJumpStatements(){
        LOGGER.info("Before my loop ");
        for (int index =0; index < 10; index++){
            if (index == 5){
                return;
            }
            LOGGER.info("My index is"+ index);
        }
        LOGGER.info("After my loop ");

    }

    public static void main(String[] args) {
        LoopingStatements app=new LoopingStatements();
        app.forLoop();
        app.whileLoop();
        app.breakJumpStatements();
        app.continueJumpStatements();
    }

    
}
