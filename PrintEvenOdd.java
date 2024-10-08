import java.util.Scanner;

public class PrintEvenOdd {
    //Write a program to accept an integer from user and print even if the number is even, Otherwise print odd.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
