public class NtoOne {
    static void f(int n) {
        // System.out.println(i);
        // base condition
        if (n == 0)
            return;
        System.out.print(n);
        f(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        f(n);
    }
}
