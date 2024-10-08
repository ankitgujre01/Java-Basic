import java.util.Scanner;

public class DivisibleThreeNumbers {
//    Write a program to accept three numbers from user and print all are divisible by 9, if all three numbers are divisible by 9.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter 1st Number = ");
    double firstNumber = scanner.nextDouble();

    System.out.print("Enter 2nd Number = ");
    double secondNumber = scanner.nextDouble();

    System.out.print("Enter 3rd Number = ");
    double thirdNumber = scanner.nextDouble();

    if (firstNumber % 9 == 0 && secondNumber % 9 == 0 && thirdNumber % 9 == 0){
        System.out.println("All are divisible by 9.");
    }else {
        System.out.println("All Numbers are not divisible by 9.");
    }
}
}
