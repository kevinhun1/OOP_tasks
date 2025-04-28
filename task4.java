//This is task4 of the assignment.
// This program takes a user's name and age as input and prints a message.

import java.util.Scanner;

class task4 {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge() {
        String name;
        int age; // in years

        System.out.print("Name? ");
        name = scanner.next();

        System.out.print("Age? ");
        age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " springs young");
    }

    public static void main(String[] args) {
        (new task4()).readNameAndAge();
    }
}