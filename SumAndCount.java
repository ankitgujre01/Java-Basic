import java.util.Scanner;

public class SumAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;

        System.out.println("Enter numbers to sum and count. Enter 0 to stop.");

        // Loop until the user enters 0
        do {
            number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        System.out.println("The sum of the entered numbers is: " + sum);
        System.out.println("The count of the entered numbers is: " + count);
    }
}
