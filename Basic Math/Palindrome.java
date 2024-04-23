// Palindrome is a number that is same as the actual given number even when it is 
// reversed.

public class Palindrome {
    public static void count(int n) {
        // if n=7789
        // First extract the data and then print the numbers in reverse order.
        int reminder = 0;
        int temp = n;
        while (n > 0) {
            int ld = n % 10; // modular gives us the reminder
            n = n / 10; // if n=7789, now if we divide with 10 then,
            // the n value becomes 778.9. As n is an integer therefore,
            // n value becomes 778
            reminder = reminder * 10 + ld;

        }
        if (temp == reminder) {
            System.out.println("Plaindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }

    public static void main(String[] args) {
        // Palindrome number
        int n = 121;
        // Not a palindrome number
        // int n = 123;
        count(n);
    }
}
