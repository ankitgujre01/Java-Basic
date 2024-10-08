import java.util.Scanner;

public class AcceptTwoNumbers {
    public static void main(String[] args) {
//        Write a program that accept two numbers from the user and print equals if the numbers are equal.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second Number : ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber){
            System.out.println("Numbers are Equal");
        }else {
            System.out.println("Enter Number is Not Equal : ");
        }
    }
}
