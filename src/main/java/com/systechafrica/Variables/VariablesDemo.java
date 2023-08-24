package com.systechafrica.Variables;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.logging.Logger;

public class VariablesDemo {
    private static final Logger LOGGER=Logger.getLogger(VariablesDemo.class.getName());


   public static void main(String[] args) {
    //integer variable
    //? type variableName
    int score=0;
    LOGGER.info("Score integer variable value is " + score);
    //constant variable
    //?final type variableName=value;
    final double PI=3.14159;
    LOGGER.info("Constant variable PI= " + PI);
    LOGGER.info("Integer Minimum " + Integer.MIN_VALUE);
    LOGGER.info("Integer Maximum " + Integer.MAX_VALUE);

    LOGGER.info("Long Minimum " + Long.MIN_VALUE);
    LOGGER.info("Long Maximum " + Long.MAX_VALUE);
   } 
}
