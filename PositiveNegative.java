import java.util.Scanner;

public class PositiveNegative {
    //Write a program to accept an integer from user and print positive, if the number is positive. Otherwise, print negative. Considering number can never be equal to zero.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println("Please Enter Poitive Number.");
        } else if (number > 0) {
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
}
