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

    public static void main(String[] args) {
        LoopingStatements app=new LoopingStatements();
        app.forLoop();
        
    }
    
}
