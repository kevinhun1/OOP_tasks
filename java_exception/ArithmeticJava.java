
// Java program to demonstrates handling
// the exception using try-catch block
class ArithmeticJava {
    public static void main(String[] args)
    {
        int number1 = 300;
        int number2 = 0;
        try {
            // Code that may throw an exception
            int answer = number1 / number2;
            System.out.println("Answer: " + answer);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed!");
        }
        finally {
            // This block always executes
            System.out.println("Execution completed.");
        }
    }
}
