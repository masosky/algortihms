package com.xavi.recursion;

public class Fibonacci {

    public int fibonacci(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(0));
        System.out.println(fibonacci.fibonacci(1));
        System.out.println(fibonacci.fibonacci(2));
        System.out.println(fibonacci.fibonacci(3));
        System.out.println(fibonacci.fibonacci(4));
        System.out.println(fibonacci.fibonacci(5));
        System.out.println(fibonacci.fibonacci(6));
        System.out.println(fibonacci.fibonacci(7));
        System.out.println(fibonacci.fibonacci(8));
    }

}
