package Recursion_Iteration;

import java.util.Scanner;

// This code defines a class Recursion_Sum with a method to calculate the sum of all integers from 1 to n

public class Recursion_Sum{
    public static int sum(int n){
        // Base case: if n is 1, return 1
        if(n==1){
            return 1;
        }
        // Recursive case: n + sum of (n-1)
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        int number = 5; 
        int result = sum(number);
        System.out.println("The sum of integers from 1 to " + number + " is: " + result);
    }
}