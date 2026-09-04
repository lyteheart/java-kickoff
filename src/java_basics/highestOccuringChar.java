package java_basics;

public class highestOccuringChar {
    public static char highestOccuringCharMethods(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxCount = 0;
        char highestChar = '\0';

        for (int i = 0; i < str.length(); i++) {

            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                highestChar = str.charAt(i);
            }
        }

        return highestChar;
    }
    public static void main(String[] args) {
        char ch=highestOccuringCharMethods("aabbbcdewwww");
        System.out.println(ch);
    }
}
