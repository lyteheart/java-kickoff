package recursion;

public class addStars_between_identical_characters {
    public static String addStars(String s) {
        if (s.length()<=1)
            return s;

        String str=addStars(s.substring(1,s.length()));

        char firstChar = s.charAt(0);
        char secondChar = s.charAt(1);
        if (firstChar == secondChar) {
            return firstChar + "*" + str;
        }else{
            return firstChar + str;
        }
    }

    public static void main(String[] args) {
        System.out.println(addStars("hello"));
    }
}
