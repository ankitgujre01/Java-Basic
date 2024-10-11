import java.util.Scanner;

public class FindSumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter Number of Digits:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sumOfDigits = 0;
        int originalNum = num;

        while(num > 0){
            sumOfDigits += num % 10;
            num = num / 10;
        }
        System.out.printf("Sum of digits in "+ originalNum+" = " + sumOfDigits);
    }
}
