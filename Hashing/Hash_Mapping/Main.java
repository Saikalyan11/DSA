package Hashing.Hash_Mapping;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 2, 4, 5, 13, 21 };

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mpp.containsKey(arr[i])) {
                mpp.put(arr[i], mpp.get(arr[i]) + 1);
            } else {
                mpp.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : mpp.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }
}
