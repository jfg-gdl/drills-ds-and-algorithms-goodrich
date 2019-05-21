package org.jfg.drills.ch05.recursion;

public class jfgFibonacci {

    private static int [] fibonacci(int [] f, int n, int index) {

        if (index > n) {
            return f;
        } else if (index <= 1) {
            f[index] = index;
        } else {
            f[index] = f[index -2] + f[index - 1];
        }

        return fibonacci(f, n, ++index);
    }

    public static void main(String[] args) {

        int n = 4;     // n indicates the nth fibonacci number. That would be the n + 1 index in an array
        int index = 0;
        int [] f = new int[n + 1];


        System.out.println(fibonacci(f, n, index));
    }
}
