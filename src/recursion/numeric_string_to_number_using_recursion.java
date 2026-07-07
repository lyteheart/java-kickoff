package recursion;

public class numeric_string_to_number_using_recursion {


    public static int convertStringToInt(String input) {
        // base case
        if (input.length() == 1)
            return input.charAt(0) - '0';

        int partionedInput = convertStringToInt(input.substring(0, input.length() - 1));
        int lastDigit = input.charAt(input.length() - 1) - '0';

        return partionedInput * 10 + lastDigit;
    }


    public static void main(String[] args) {
        String s = "00010204";
        int res = convertStringToInt(s);
        System.out.println(res);
    }
}
