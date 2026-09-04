package java_basics;

public class strings_countWords {
    public static int countWords(String str) {
        int count=0;
        // split("\\s+") -> one or more whitespace character
        String newStr[]=str.trim().split("\\s+");
        count=newStr.length;

        return  count;
    }

    public static void main(String[] args) {
        int count = countWords("Hello lelo     mera dil");
        System.out.println(count);
    }
}
