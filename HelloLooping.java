public class HelloLooping {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i < 11; i++) {
            System.out.println("Hello Looping." + count++);
        }
    }
}
