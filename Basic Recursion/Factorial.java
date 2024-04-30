public class Factorial {
    static int fact(int n) {
        // n == numbers
        // S is to add numbers
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }

}
