package java_basics;

public class Reverse_Each_Word_String {
    public static String reverseEachWord(String str) {
        String[] strSplit=str.split(" ");
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < strSplit.length; i++) {
            result.append(ReverseString.stringReverse(strSplit[i].toCharArray()));
            if (i != strSplit.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "AI is making us dumb";
        String revStr = reverseEachWord(str);
        System.out.println(revStr);
    }
}
