package java_basics;

public class getCompressedString {
    public static String getCompressedStringMethods(String str) {
        // Frequency approach:
        //a4b2 ❌
        //
        //Consecutive compression:
        //a2b2a2 ✅

        if (str.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {

                sb.append(str.charAt(i - 1));

                if (count > 1) {
                    sb.append(count);
                }

                count = 1;
            }
        }

        // Handle last group
        sb.append(str.charAt(str.length() - 1));

        if (count > 1) {
            sb.append(count);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = getCompressedStringMethods("aaabbcddeeeee");
        System.out.println(str);
    }
}
