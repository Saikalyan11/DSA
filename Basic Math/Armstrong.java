public class Armstrong {
    public static void armstrong(int n) {
        int count = 0;
        // duplicating value of n
        int temp = n;

        int sum = 0;
        // duplicating value of n

        int dup = n;
        // counting the digits of the given number
        while (n > 0) {
            n = n / 10;
            count++;
        }
        // System.out.println(count);
        // adding each digit by giving the power as no. of digits
        while (temp > 0) {
            int ld = temp % 10;
            sum = sum + (int) Math.pow(ld, count);
            temp = temp / 10;
        }
        // System.out.println(sum);

        // checking the real number and final number after the calculations
        if (dup == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        int n = 1634;
        armstrong(n);
    }
}
