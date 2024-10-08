import java.util.Scanner;

public class SimpleInterests {
    public static void main(String[] args) {
        double principle;
        double rate;
        double time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principle, rate and time");
        principle = scanner.nextDouble();
        rate = scanner.nextDouble();
        time = scanner.nextDouble();
        double simpleInterest = principle * rate * time / 100;
        System.out.println("Simple interest is " + simpleInterest);
    }
}
