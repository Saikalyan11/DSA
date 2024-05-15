package Hashing;

public class CharacterhashingBigletters {
    public static void main(String[] args) {
        // Capital and small letters Character Hashing
        String s = "ABCDaaaaAFbbEDA";

        // pre-store or pre-compute
        int hash[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)] += 1;
        }

        // query
        char c = 'A';
        System.out.println(hash['b']);
    }
}
