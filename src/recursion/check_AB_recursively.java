package recursion;

/*
Rules:

1. The string must always start with 'a'.

2. After every 'a', only these are allowed:
   - End of string
   - Another 'a'
   - "bb"

3. After every "bb", only these are allowed:
   - End of string
   - 'a'

---------------------------------------

Examples:

Valid:
a
aa
abb
aabb
abba
abbaabb
aaaa

Invalid:
b
ab
abababa
abbb
baa
*/


public class check_AB_recursively {

    public static boolean checkAB(String input) {
        // Empty string is valid after consuming everything correctly
        if (input.length() == 0)
            return true;
        // Every recursive call must start with 'a'
        if (input.charAt(0) != 'a')
            return false;
        // Only 'a' left
        if (input.length() == 1)
            return true;

        // Rule: a -> a
        if (input.charAt(1) == 'a') {
            return checkAB(input.substring(1));
        }
        // Rule: a -> bb
        if (input.length() >= 3 && input.charAt(1) == 'b' && input.charAt(2) == 'b') {
            return checkAB(input.substring(3));
        }

        // Any other pattern will be ignored
        return false;


    }


    public static void main(String[] args) {
        System.out.println(checkAB("abbaabb"));
    }
}
