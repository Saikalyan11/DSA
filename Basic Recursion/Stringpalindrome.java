public class Stringpalindrome {
    static boolean ispalindrom(String name, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (name.charAt(start) != name.charAt(end)) {
            return false;
        }
        return ispalindrom(name, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String name = "11211";
        if (ispalindrom(name, 0, name.length() - 1)) {
            System.out.println("Yes, this string is a palindrome");
        } else {
            System.out.println("No it's not");
        }
    }
}
