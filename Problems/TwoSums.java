package Problems;

public class TwoSums {
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 7 };
        int target = 9;
        System.out.println(twoSum(arr, target));
    }
}
