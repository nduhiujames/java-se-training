package com.systechafrica.part2.staticclasses;

public class MathUtilsStaticDemo {
    private String operationName;
    public void printInfo(){
     System.out.println("printing");   
    }
    private static class Calculator {
        public static int add(int a, int b) {
            MathUtilsStaticDemo math=new MathUtilsStaticDemo();
            System.out.println(math.operationName);
            math.printInfo();
            return a + b;

        }

        public static int multiply(int a, int b) {
            return a * b;
        }

    }

    public static int sum(int a, int b) {
        return Calculator.add(a, b);
    }

    public static class AreaMath extends Calculator {
        public static int square(int a, int b) {
            return multiply(a, b);
        }
    }

}
