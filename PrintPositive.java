import java.util.Scanner;

public class PrintPositive {
    public static void main(String[] args) {
        //Write a program that accept an integer form user and print positive, if the integer is positive.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer number : ");
        int integerNumber = scanner.nextInt();

        if (integerNumber > 0){
            System.out.println("Integer is Positive.");
        }else {
            System.out.println("Negative or invalid Integer.");
        }
    }
}
