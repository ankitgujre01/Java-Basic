import java.util.Scanner;

public class TaxCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept annual income from the user
        System.out.print("Enter your annual income (INR): ");
        double annualIncome = scanner.nextDouble();

        // Standard deduction
        double standardDeduction = 50000;
        double taxableIncome = annualIncome - standardDeduction;

        // Calculate tax based on the taxable income
        double tax = 0;
        if (taxableIncome <= 300000) {
            tax = 0;
        } else if (taxableIncome <= 500000 ) {
            tax = (taxableIncome - 300000) * 0.05;
        } else if (taxableIncome <= 1000000) {
            tax = (200000 * 0.05) + (taxableIncome - 500000) * 0.15;
        } else if (taxableIncome <= 1500000) {
            tax = (200000 * 0.05) + (500000 * 0.15) + (taxableIncome - 1000000) * 0.20;
        } else if (taxableIncome <= 2500000) {
            tax = (200000 * 0.05) + (500000 * 0.15) + (500000 * 0.20) + (taxableIncome - 1500000) * 0.25;
        } else {
            tax = (200000 * 0.05) + (500000 * 0.15) + (500000 * 0.20) + (1000000 * 0.25) + (taxableIncome - 2500000) * 0.30;
        }

        // Print the tax amount
        System.out.println("The Calculated tax Amount is = " + tax);
    }
}
