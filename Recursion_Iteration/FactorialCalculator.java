package Recursion_Iteration;
// This code defines a class FactorialCalculator with a method to calculate the factorial of a number

import java.util.Scanner;

public class FactorialCalculator {
    public static int factorial(int n){
        // Base case: if n is 0 or 1, return 1
        if(n == 0 || n == 1){
            return 1;
        } else {
            // Recursive case: n * factorial of (n-1)
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; 
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
