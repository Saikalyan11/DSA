import java.util.Arrays;

public class ReverseanArray {
    static void reverse(int[] i, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = i[start];
        i[start] = i[end];
        i[end] = temp;
        start++;
        end--;
        reverse(i, start, end);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("O no.: " + Arrays.toString(arr));

        reverse(arr, 0, arr.length - 1);
        System.out.println("R no.: " + Arrays.toString(arr));
    }

}
