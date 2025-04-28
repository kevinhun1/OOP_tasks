// This is task 3 of the assignment.
// This program takes a student's score as input and determines the grade.
// The grading scale is as follows:
// A: 90-100
// B: 80-89
// C: 70-79
// D: 60-69
// F: 0-59
// If the score is less than 0 or greater than 100, it will prompt the user to enter a valid score.

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score >= 0) {
            grade = "F";
        } else {
            grade = "Invalid score";
        }

        if (!grade.equals("Invalid score")) {
            System.out.println("The student's grade is: " + grade);
        } else {
            System.out.println("Please enter a valid score between 0 and 100.");
        }

        scanner.close();
    }
}

