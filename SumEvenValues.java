import java.util.Scanner;

public class SumEvenValues {
    //Write a program to print the sum of all the even values entered by user until user enter 0 to stop.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int valueNumber;
        System.out.println("Enter Values : ");

        do {
            valueNumber = scanner.nextInt();

            if (valueNumber % 2 == 0){
                System.out.println("Enter value is even = " + valueNumber);
                sumEven += valueNumber;
            }else {
                System.out.println("Enter value is odd = " + valueNumber);
            }

        }while(valueNumber != 0);
        System.out.println("sum of even number  = " + sumEven);
    }
}
