package com.systechafrica.Variables;

import java.util.logging.Logger;

public class VariableScopes {
     private static final Logger LOGGER = Logger.getLogger(VariableScopes.class.getName());
     //class variables = defined as variables

     private int NoOfMatchesPlayed=3;
      public void simpleMethod(){
        LOGGER.info("Simple method output "+NoOfMatchesPlayed);
     }
     public void complexMethod(){
        LOGGER.info("Complex method output "+NoOfMatchesPlayed);
     }
     public int addTwoNumbers(int a, int b){//method variable scope= variables defined as parameters and
        //variables declared in the outermost part of the method
        //only available when the method is executing
        int results= a+b;
        for (int i = 0;i<5;i++){
            LOGGER.info("method output "+i);

        }
        return results;

     }


     public static void main(String[] args) {
        VariableScopes app=new VariableScopes();
        app.simpleMethod();
        app.complexMethod();
        LOGGER.info("main method output "+app.NoOfMatchesPlayed);
     }
    
}
