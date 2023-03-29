import java.util.Scanner;
import java.lang.Math;


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
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Tangent");
            System.out.println("9. Logarithm (base 10)");
            System.out.println("10. Natural Logarithm (base e)");
            System.out.println("11. Factorial");
            System.out.println("12. Exit");
            System.out.print("Enter your choice (1-12): ");
            int choice = scanner.nextInt();

            if (choice == 12) {
                exit = true;
                continue;
            }

            if (choice >= 1 && choice <= 5) {
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
                            System.out.println("Error: Division by zero.");
                        } else {
                            result = firstNumber / secondNumber;
                            System.out.printf("Result: %.2f / %.2f = %.2f%n", firstNumber, secondNumber, result);
                        }
                        break;
                    case 5:
                        result = Math.pow(firstNumber, secondNumber);
                        System.out.printf("Result: %.2f ^ %.2f = %.2f%n", firstNumber, secondNumber, result);
                        break;
                }
            } else {
                System.out.print("Enter the number: ");
                double number = scanner.nextDouble();
                switch (choice) {
                    case 6:
                        result = Math.sin(Math.toRadians(number));
                        System.out.printf("Result: sin(%.2f) = %.2f%n", number, result);
                        break;
                    case 7:
                        result = Math.cos(Math.toRadians(number));
                        System.out.printf("Result: cos(%.2f) = %.2f%n", number, result);
                        break;
                    case 8:
                        result = Math.tan(Math.toRadians(number));
                        System.out.printf("Result: tan(%.2f) = %.2f%n", number, result);
                        break;
                    case 9:
                        result = Math.log10(number);
                        System.out.printf("Result: log10(%.2f) = %.2f%n", number, result);
                        break;
                    case 10:
                        result = Math.log(number);
                        System.out.printf("Result: log(%.2f) = %.2f%n", number, result);
                        break;

                        case 11:
                        result = factorial(number);
                        System.out.printf("Result: %.2f! = %.2f%n", number, result);
                        break;
                }
            }
        }
        scanner.close();
    }

    public static double factorial(double number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}

