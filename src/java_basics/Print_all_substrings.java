package java_basics;

public class Print_all_substrings {
    public static void printSubstrings(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                String strOne=sb.substring(i,j);
                System.out.println(strOne);
            }
        }
    }

    public static void main(String[] args) {
        printSubstrings("abcdef");
    }
}
