package com.bridgelabz.assignmentsrfp259.day13.javagenerics;

public class JavaGenericsPrograms {
    public static void main(String[] args) {
        System.out.println("Welcome To Java Generics Programs: ");
        System.out.println("The Max Integer Number Among 3 Integer Numbers is: " + maxNumberInteger(93, 26, 43));
        System.out.println("The Max Float Number Among 3 Float Numbers is: " + maxNumberFloat(93.32f, 2698.76f, 437.3f));
        System.out.println("The Max String Number Among 3 String Number is: " + maxStringNumber("Apple", "Peach", "Banana"));
        System.out.println();
        System.out.println("Printing Maximum Number By Using Generic Method: ->");
        System.out.println("The Max Number Among 3 Integer numbers is: " + maxAmong3Number(1504, 22, 27));
        System.out.println("The Max Number Among 3 Float numbers is: " + maxAmong3Number(32.5f, 56.98f, 78.99f));
        System.out.println("The Max Number Among 3 String numbers is: " + maxAmong3Number("Apple", "Dragonfruit", "Banana"));
    }

    //Program For Maximum Integer
    public static Integer maxNumberInteger(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            max = num1;
        else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            max = num2;
        else
            max = num3;
        return max;
    }

    //Program For Maximum Floats
    public static Float maxNumberFloat(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            max = num1;
        else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            max = num2;
        else
            max = num3;
        return max;
    }

    //Program For Maximum Strings
    public static String maxStringNumber(String num1, String num2, String num3) {
        String max = num1;
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            max = num1;
        else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            max = num2;
        else
            max = num3;
        return max;
    }

    //Refactor-1 -> Program For Maximum Using One Generic Method
    public static <T extends Comparable<T>> T maxAmong3Number(T num1, T num2, T num3) {
        T max = num1;
        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
            max = num1;
        else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
            max = num2;
        else
            max = num3;
        return max;
    }
}
