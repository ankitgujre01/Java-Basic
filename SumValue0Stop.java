import java.util.Scanner;

public class SumValue0Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to sum. Enter 0 to stop.");

        // Loop until the user enters 0
        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The sum of the entered numbers is: " + sum);
    }
}
