import java.util.Scanner;

public class EvenOdd0Stop {
    //Write a program to check all the values entered by user, if the entered value is even print, if the entered value is odd print odd, if the entered value is 0 stop.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueNumber;

        System.out.println("Enter Value");

        do {

             valueNumber = scanner.nextInt();

          if (valueNumber % 2 == 0 ){
              System.out.println("Enter value is Even. " + valueNumber);
          }else {
              System.out.println("Enter value is odd." + valueNumber);
          }
        }while(valueNumber != 0);
        System.out.println("Program Stop.");
    }
}
