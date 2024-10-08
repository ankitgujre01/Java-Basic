import java.util.Scanner;

public class CalculateSquare {
    public static void main(String[] args) {
        double side;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side");
        side = scanner.nextDouble();
        double square = side * side;
        System.out.print("Square is = " + square);
    }
}
