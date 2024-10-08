import java.util.Scanner;

public class ChieneseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept birth year from the user
        System.out.print("Enter your birth year (YYYY): ");
        int birthYear = scanner.nextInt();

        // Calculate the Chinese zodiac sign
        int zodiacIndex = birthYear % 12;

        // Determine the zodiac sign based on the index
        String zodiacSign;
        switch (zodiacIndex) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
            default:
                zodiacSign = "Unknown";
                break;
        }

        // Print the Chinese zodiac sign
        System.out.println("Your Chinese zodiac sign is: " + zodiacSign);
    }
}
