package Hashing;

import java.util.Scanner;

public class CountElementsofArray {
    public static void main(String[] args) {
        // assigning inputs
        int n[] = new int[5];
        // default array
        int arr[] = { 1, 2, 3, 2, 2 };

        // this below for-loop is used to assign the values for an array from user or
        // scanner
        // for (int i = 0; i < n.length; i++) {
        // n[i] = sc.nextInt();
        // }

        // pre-storing
        int hash[] = new int[13];
        for (int i = 0; i < n.length; i++) {
            hash[arr[i]] += 1;
        }

        // query (this checks and counts the value which presents in the array or not)

        int numbers = 2;
        System.out.println(hash[numbers]);

    }
}
