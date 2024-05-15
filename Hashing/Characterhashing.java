package Hashing;

import java.util.*;

public class Characterhashing {
    public static void main(String[] args) {

        // for small letters

        // input
        String s = "abcdaefc";
        int len = s.length();
        char c = 'a';

        // pre-store or pre-compute
        int hash[] = new int[26];
        for (int i = 0; i < len; i++) {
            hash[s.charAt(i) - c] += 1;
        }

        // query
        char q = 'f';
        int res = q - 'a';
        System.out.println(hash[res]);

    }
}
