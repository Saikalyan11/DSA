public class GCDAdvanced {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 12;
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;

            }
        }
    }
}
