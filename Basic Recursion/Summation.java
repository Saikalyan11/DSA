public class Summation {
    static void sum(int n, int s) {
        // n == numbers
        // S is to add numbers
        if (n < 1) {
            System.out.print(s);
            return;
        }
        sum(n - 1, s + n);
    }

    public static void main(String[] args) {
        int n = 10;
        int s = 0;
        sum(n, s);
    }
}
