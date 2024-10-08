import java.util.Scanner;

/*
import java.util.Scanner;

public class RemainderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (number1 > 0 && number2 > 0) {
            int remainder1 = number1 % 5;
            int remainder2 = number2 % 5;

            if (remainder1 == remainder2) {
                System.out.println("Numbers are equal");
            } else {
                System.out.println("Numbers are not equal");
            }
        } else {
            System.out.println("Calculation not possible");
        }
    }
}

*/

public class GetReminderDivision {
    //Write a program to accept two numbers from user, if the both the numbers are positive, get the remainder of the division by 5 for both the numbers. If remainder of both the division are equal print numbers are equal, otherwise number are not equal. If one or both the numbers are negative, print calculation not possible.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter Second Number : ");
        double secondNumber = scanner.nextInt();

        if (firstNumber % 5 == 0 && secondNumber % 5 == 0){
            System.out.println("Reminders are Equal.");
        }else if (firstNumber <= 0 && secondNumber <= 0){
            System.out.println("Calculation Not Posible.");
        }else if (firstNumber % 5 != 0 && secondNumber % 5 != 0){
            System.out.println("Reminders are not Equal.");
        }else{
            System.out.println("please enter valid no.");
        }
    }
}
