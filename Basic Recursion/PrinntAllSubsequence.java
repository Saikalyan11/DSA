import java.util.ArrayList;
import java.util.List;

public class PrinntAllSubsequence {
    // recursion (multi recursion)
    static void f(int i, ArrayList<Integer> empty, int n, int arr[]) {
        // base condition
        if (i >= n) {
            System.err.println(empty);
            return;
        }
        // adding the array(arr[]) values from main method to empty array
        empty.add(arr[i]);
        f(i + 1, empty, n, arr);
        // after one recursion call is executed removing that value from empty array
        empty.remove(empty.size() - 1);
        f(i + 1, empty, n, arr);
    }

    public static void main(String[] args) {
        // to find the subsequence of any sequence which are arranged in an array
        // over here we have used an int array as the variable where {3,2,1} as an index
        // of 0,1,2,respectively.
        int arr[] = { 3, 1, 2 };
        // now im going to find the length of the array.
        int n = arr.length;
        // here comes the important step in my code that is initializing a empty array
        // this empty array will be used to add the values respected to index
        ArrayList<Integer> empty = new ArrayList<>();
        // finally call the function
        f(0, empty, n, arr);
    }
}