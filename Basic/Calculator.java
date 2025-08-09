import java.util.Scanner;

public class Calculator {

    static int add(int num1, int num2) {
        int total = 0;
        total = num1 + num2;
        return total;
    }

    static int subtract(int num1, int num2) {
        int total = 0;
        total = num1 - num2;
        return total;
    }

    static int divide(int num1, int num2) {
        int total = 0;
        total = num1 / num2;
        return total;
    }

    static int multiply(int num1, int num2) {
        int total = 0;
        total = num1 * num2;
        return total;
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        int num1;
        int num2;
        int sum = 0;
        String userC;

        System.out.print("Enter First Number: ");
        num1 = userInput.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = userInput.nextInt();
        System.out.print("Enter operation (a, s, d, x): ");
        userC = userInput.next();
        userC = userC.toString();
        // Calculator
        if (userC == "a") {
            System.out.println("Result: " + add(num1, num2));
        } else if (userC == "s") {
            System.out.println("Result: " + subtract(num1, num2));
        } else if (userC == "x") {
            System.out.println("Result: " + multiply(num1, num2));
        } else if (userC == "d") {
            System.out.println("Result: " + divide(num1, num2));
        }

    }
}
