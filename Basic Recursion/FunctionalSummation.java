public class FunctionalSummation {
    static int sum(int n) {
        // n == numbers
        // S is to add numbers
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }

}
