package org.jfg.drills.ch05.recursion;

public class Factorial {

    public static void main (String [] args){
        if (args.length > 0 && Integer.valueOf(args[0]) >= 0) {
            System.out.println(calculateFactorial(Integer.valueOf(args[0])));
        }

        System.out.format("Factorial de %d is: %d\n", 0, calculateFactorial(0));
        System.out.format("Factorial de %d is: %d\n", 1, calculateFactorial(1));
        System.out.format("Factorial de %d is: %d\n", 2, calculateFactorial(2));
        System.out.format("Factorial de %d is: %d\n", 3, calculateFactorial(3));
        System.out.format("Factorial de %d is: %d\n", 4, calculateFactorial(4));
        System.out.format("Factorial de %d is: %d\n", 5, calculateFactorial(5));
        System.out.println("Next we have an attempt to calculate -1! which results in an exception.");
        System.out.format("Factorial de %d is: %d\n", -1, calculateFactorial(-1));
    }

    public static int calculateFactorial(int n) {
        if (n < 0){
            StringBuilder sb = new StringBuilder("Integer ")
                    .append(n)
                    .append(" is less than zero.")
                    .append(" Factorial is defined for integers greater or equal to zero.");
            throw new IllegalArgumentException(sb.toString());
        }

        if (n == 0){
            return 1;
        }
        return n * calculateFactorial(n -1);
    }
}
