package recursion;

public class check_Sequence_of_a_string {

    public static boolean checkSequence(String a, String b) {

        // All characters of b are found
        if (b.isEmpty()) {
            return true;
        }

        // a finished before b
        if (a.isEmpty()) {
            return false;
        }

        // Characters match
        if (a.charAt(0) == b.charAt(0)) {
            return checkSequence(a.substring(1), b.substring(1));
        }

        // Characters don't match
        return checkSequence(a.substring(1), b);
    }

    public static void main(String[] args) {
        System.out.println(checkSequence("abchjsgsuohhdhyrikkknddg", "coding"));
        System.out.println(checkSequence("abcde", "aeb"));
    }
}
