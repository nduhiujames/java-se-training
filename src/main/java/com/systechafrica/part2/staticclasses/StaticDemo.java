package com.systechafrica.part2.staticclasses;

public class StaticDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        System.out.println(MathUtils.Geometry.calculateArea(a, b));
        System.out.println(MathUtils.Geometry.calculatePerimeter(a, b));
        System.out.println(MathUtils.Calculator.sum(a, b));
        String name = null;
        boolean nameEmptyOrNull = StringUtils.isNullOrEmpty(name);
        System.out.println("nameEmptyOrNull= " + nameEmptyOrNull);
        String password = " Admin@123";
        String confirmPassword="Admin@123";
        if(StringUtils.trim(password).equals(StringUtils.trim(confirmPassword))){
            System.out.println("Passwords are Equal");
        }

    }
}
