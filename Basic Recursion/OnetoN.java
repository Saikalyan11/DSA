public class OnetoN {

    // Brute force approach
    static void f(int i, int n) {

        if (i > n)
            return;
        System.err.print(" " + i);

        f(i + 1, n);
    }

    // Using Backtracking algorithm
    static void fb(int n) {
        if (n == 0)
            return;
        fb(n - 1);
        System.err.print(" " + n);
    }

    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        System.out.print("Using Brute Forcee");
        f(i, n);
        System.out.println();
        System.out.println();
        System.out.print("Using backtracking algorithm");
        fb(n);
    }
}
