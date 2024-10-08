import java.util.Scanner;
//Write a program to accept an integer from user. If the number is even make it odd and print. If the number is odd make it even and print.
public class ChangeEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            number += 1;
            System.out.println("after change odd" + number);
        } else {
            number -= 1;
            System.out.println("after change printing even");
        }
    }
}

