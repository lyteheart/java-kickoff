package java_basics;

public class removeAllOccurrencesOfChar {
    public static String removeAllOccurrencesOfCharMethods(String str, char ch) {
        // Your code goes here

        if(str.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str=removeAllOccurrencesOfCharMethods("aabccbaa",'a');
        System.out.println(str);
    }
}
