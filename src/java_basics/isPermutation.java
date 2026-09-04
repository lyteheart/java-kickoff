package java_basics;

public class isPermutation {
    public static boolean isPermutationMethods(String str1, String str2) {
        // We need to check word frequency as well as they present or not.
        // Only present or not will not be permutation Solution
        // Not only characters, but also frequency must match. 🚀
//        ------
        // Think of: freq as a bank account.
        // First loop: Deposit characters from str1
        // Second loop: Withdraw characters from str2
        // Final balance: Everything canceled out. Should be Zero.


        // First check the length
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256];

        // First loop: Deposit Money like
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        // Second loop: Withdraw Money like
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        // Check last balance should be 0
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        boolean ispermut=isPermutationMethods("hearts","earth");
        System.out.println(ispermut);
    }
}
