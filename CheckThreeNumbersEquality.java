import java.util.Scanner;

public class CheckThreeNumbersEquality {
    public static void main(String[] args) {
//        Write a program to accept three numbers from user and print equals if the numbers are equal.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter Third Number : ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber && secondNumber == thirdNumber){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Enter Number is Not Equal : ");
        }

    }
}
