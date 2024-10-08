public class PrintOddNumbers {
    public static void main(String[] args) {
        int numbers = 1;

        do {
            if (numbers % 2 != 0) {
                System.out.println(numbers);
            }
            numbers++;
        } while (numbers <= 20);
    }
}
