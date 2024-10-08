import java.util.Scanner;

class BankAccount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentBalance = 5000  ;
        System.out.println("Enter Withdrawl Amount : ");
        int withdrawlAmount = scanner.nextInt();

        if (withdrawlAmount <= currentBalance){
            currentBalance -= withdrawlAmount;

            if (currentBalance < 500){
                System.out.println("Penalty 50 INR.");
            }
            System.out.println("Current Balance After withdrawl = " + currentBalance);
        }else {
            System.out.println("Insufficient Fund");
        }
    }
}