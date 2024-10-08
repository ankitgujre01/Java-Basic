import java.util.Scanner;

public class OddOneAmong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Four Numbers : ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 == num2 && num2 == num3 && num3 != num4) {
            System.out.println("Odd one out is: " + num4);
        } else if (num1 == num2 && num2 == num4 && num4 != num3) {
            System.out.println("Odd one out is: " + num3);
        } else if (num1 == num3 && num3 == num4 && num4 != num2) {
            System.out.println("Odd one out is: " + num2);
        } else if (num2 == num3 && num3 == num4 && num4 != num1) {
            System.out.println("Odd one out is: " + num1);
        }  else {
            System.out.println("No number is odd one among them.");
        }
    }

}
