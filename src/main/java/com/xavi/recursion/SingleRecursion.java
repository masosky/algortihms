package com.xavi.recursion;

import java.util.Scanner;

public class SingleRecursion {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Can't calculate factorial of negative");
        }

        if (n < 2) {
            return 1;
        } else {
            long tmp = n * factorial(n - 1);
            System.out.println(tmp);
            return tmp;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Factorial of what number do you want to calculate? ");
        int num = stdIn.nextInt();
        System.out.printf("%d! = %d", num, factorial(num));

        stdIn.close();
    }

}