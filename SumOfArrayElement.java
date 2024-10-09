import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[n];

        // Read array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Display the result
        System.out.println("The sum of the array elements is: " + sum);

    }
}
