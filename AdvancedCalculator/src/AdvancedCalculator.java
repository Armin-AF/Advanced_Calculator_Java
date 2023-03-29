import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        String input;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nAdvanced Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exponentiation");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();

            if (choice == 6) {
                exit = true;
                continue;
            }

            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            switch (choice) {
                case 1:
                    result = firstNumber + secondNumber;
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;
                case 2:
                    result = firstNumber - secondNumber;
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;
                case 3:
                    result = firstNumber * secondNumber;
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;
                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Cannot divide by zero");
                        break;
                    }
                    result = firstNumber / secondNumber;
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;
                case 5:
                    result = Math.pow(firstNumber, secondNumber);
                    System.out.printf("Result: %.2f ^ %.2f = %.2f%n", firstNumber, secondNumber, result);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("Goodbye!");
    }
}

