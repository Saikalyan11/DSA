// Counting digits is a basic math concept which helps to count numbers in a given number.

public class DigitsCount {
    public static void count(int n) {
        // if n=7789
        // First extract the data and then count the operations.
        int count = 0;
        while (n > 0) {
            int ld = n % 10; // modular gives us the reminder
            n = n / 10; // if n=7789, now if we divide with 10 then,
            // the n value becomes 778.9. As n is an integer therefore,
            // n value becomes 778
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 778989;
        count(n);
    }
}