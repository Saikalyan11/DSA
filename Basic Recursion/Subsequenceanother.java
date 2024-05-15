import java.util.ArrayList;

public class Subsequenceanother {
    static void f(int i, int s, int sum, int n, ArrayList<Integer> ds, int[] arr) {
        if (i == n) {
            if (s == sum) {
                System.out.println(ds);
            }
            return;
        }
        // pick
        ds.add(arr[i]);
        s += arr[i];
        f(i + 1, s, sum, n, ds, arr);
        ds.remove(ds.size() - 1);
        s -= arr[i];
        // not pick
        f(i - 1, s, sum, n, ds, arr);
    }
}
