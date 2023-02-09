package com.example.helloworld;

public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference + ".");
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product + ".");
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient + ".");
        System.out.println("The remainder of " + num1 + " and " + num2 + " is " + remainder + ".");
    }
}
