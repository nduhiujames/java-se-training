package com.systechafrica.Variables;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.logging.Logger;

public class VariablesDemo {
    private static final Logger LOGGER = Logger.getLogger(VariablesDemo.class.getName());

    private void variableDeclarations() {
        // integer variable
        // ? type variableName
        int score = 0;
        LOGGER.info("Score integer variable value is " + score);
    }

    private void constantsVariables() {
        // constant variable
        // ?final type variableName=value;
        final double PI = 3.14159;
        LOGGER.info("Constant variable PI= " + PI);
    }

    private void integerTypes() {

        LOGGER.info("Integer Minimum " + Integer.MIN_VALUE);
        LOGGER.info("Integer Maximum " + Integer.MAX_VALUE);

        LOGGER.info("Long Minimum " + Long.MIN_VALUE);
        LOGGER.info("Long Maximum " + Long.MAX_VALUE);
        // byte, short, int, long
        // ?Wrapper classes

        byte aPrimitive = 23;
        Byte aWrapper = 23;
        int a = aWrapper.intValue();

        LOGGER.info("byte primitive " + aPrimitive);
        LOGGER.info("Byte wrapper " + aWrapper);
        LOGGER.info("Integer value from Byte wrapper " + a);

        // short
        short s = 23;
        Short aShort = 23;
        // integer
        int c = 23;
        Integer aInt = 23;
        // long
        long d = 23;
        Long aLong = 23L;
    }

    private void floatingTypes() {
        // float types
        float floatRate = 2.14574546F;
        double doubleRate = 2.14574546;
        LOGGER.info("float value " + floatRate);
        LOGGER.info("double value " + doubleRate);
        // float
        float price = 0.2365F;
        Float priceFloat = 0.2365F;
        // double
        double prtPrice = 0.2365;
        Double pricDouble = 0.2365;

    }

    private void characterTypes() {
        // character types
        char grade = 'A';

        LOGGER.info("character value " + grade);

        // character type
        Character characterGrade = 'F';
    }

    private void booleanTypes() {
        // boolean types
        boolean isPromoted = false;
        boolean isProcessed = true;

        LOGGER.info("false value " + isPromoted);
        LOGGER.info("true value " + isProcessed);
    }

    public static void main(String[] args) {
        VariablesDemo demo = new VariablesDemo();

        demo.variableDeclarations();

        demo.constantsVariables();

        demo.integerTypes();

        demo.floatingTypes();

        demo.characterTypes();

        demo.booleanTypes();

        long a = 2147483648L;
        int b = (int) a;
         LOGGER.info("int b value " + b);
    }

}
