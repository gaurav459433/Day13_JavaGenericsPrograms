package com.bridgelabz.assignmentsrfp259.day13.javagenerics;

public class JavaGenericsPrograms {
    public static void main(String[] args) {
        System.out.println("Welcome To Java Generics Programs: ");
        System.out.println("The Max Integer Number Among 3 Integer Numbers is: "+maxNumberInteger(93, 26, 43));
    }

    public static Integer maxNumberInteger(Integer num1, Integer num2, Integer num3)
    {
        Integer max = num1;
        if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            max = num1;
        else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            max = num2;
        else
            max = num3;
        return max;
    }
}
