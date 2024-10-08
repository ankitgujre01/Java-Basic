import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping, num1 = " + num1 + " and num2 = " + num2);
    }

}
