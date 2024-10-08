public class DivisibleBy5 {
    public static void main(String[] args) {
        int numbers = 1;
        do {
            if (numbers % 5 == 0) {
                System.out.println(numbers);
            }
            numbers++;
        } while (numbers <= 100);
    }
}
