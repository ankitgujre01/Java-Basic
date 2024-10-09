public class PrintArray {
    public static void main(String[] args) {
        // Create an array to store 10 integers
        int[] numbers = new int[10];

        // Store 10 numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Storing numbers 1 to 10 for simplicity
        }

        // Print the numbers in the array
        System.out.println("The numbers in the array are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}