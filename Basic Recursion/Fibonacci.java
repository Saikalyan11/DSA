public class Fibonacci {
    static int f(int n) {
        if (n <= 1) {
            return 1;
        }
        int last = f(-1);
        int slast = f(n - 2);
        return last + slast;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(f(n));
    }
}
