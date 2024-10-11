import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Enter Numbers");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numberOfDigits = 0;
        
        while(num > 0){
            num = num/10;
            numberOfDigits++;
        }
        System.out.println("numberOfDigits = " + numberOfDigits);
    }
}
