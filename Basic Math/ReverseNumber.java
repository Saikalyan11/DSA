// ReverseNumber is used to rewrite the actual number from back to front.

public class ReverseNumber {
    public static void count(int n) {
        // if n=7789
        // First extract the data and then print the numbers in reverse order.
        int reminder = 0;
        while (n > 0) {
            int ld = n % 10; // modular gives us the reminder
            n = n / 10; // if n=7789, now if we divide with 10 then,
            // the n value becomes 778.9. As n is an integer therefore,
            // n value becomes 778
            reminder = reminder * 10 + ld;

        }
        System.out.println(reminder);
    }

    public static void main(String[] args) {
        int n = 12365478;
        count(n);
    }
}
