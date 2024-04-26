public class NtoOne {
    // Brute Force approach
    static void fb(int n) {
        // base condition
        if (n == 0)
            return;
        System.out.print(n);
        fb(n - 1);
    }

    static void f(int i, int n) {
        if (i > n)
            return;
        f(i + 1, n);
        System.out.print(i);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        fb(n);
        System.out.println();
        f(i, n);
    }
}
