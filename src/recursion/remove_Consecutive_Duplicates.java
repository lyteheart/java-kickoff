package recursion;

public class remove_Consecutive_Duplicates {

    public static String removeConsecutiveDuplicates(String s) {
       if (s.length()<=1)
           return s;

       String smallOutput=removeConsecutiveDuplicates(s.substring(1));

       if (s.charAt(0)==s.charAt(1)){
           return smallOutput;
       }else{
           return s.charAt(0)+smallOutput;
       }
    }



    public static void main(String[] args) {
        String res=removeConsecutiveDuplicates("xxxyyyzwwzzz");
        System.out.println(res);
    }
}
