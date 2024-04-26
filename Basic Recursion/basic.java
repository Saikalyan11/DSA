
public class basic {

    static void sum(int n1) {
        if (n1 == 5)
            return;
        System.out.println(n1);
        n1++;
        sum(n1);
    }

    public static void main(String[] args) {
        int n1 = 0;
        sum(n1);
    }
}
