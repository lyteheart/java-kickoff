package recursion;

public class is_palindrome_recursive {

    public static boolean isPalindromeUsingIndex(String str, int index) {
        // Base Case
        if (index >= str.length() / 2) {
            return true;
        }

        int end = str.length() - 1 - index;
        if (str.charAt(index) != str.charAt(end)) {
            return false;
        } else {
            return isPalindromeUsingIndex(str, index + 1);
        }
    }

    public static boolean isPalindrome(String str) {
        return isPalindromeUsingIndex(str, 0);
    }


    public static void main(String[] args) {
        boolean isPal = isPalindrome("abcba");
        System.out.println(isPal);
    }
}
