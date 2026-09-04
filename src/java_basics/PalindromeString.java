package java_basics;

public class PalindromeString {

    public static boolean isPalindrome(String str) {
        char[] a = new char[str.length()];
        int index = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            a[index++] = str.toCharArray()[i];
        }

        String reversed = new String(a);

        return reversed.equals(str);
    }

    //    Using Two Pointer ( Memory Optimized )
    public static boolean isPalindromeUsingTwoPointer(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isItPalindrome = isPalindrome("madam");
        System.out.println(isItPalindrome);
    }
}
