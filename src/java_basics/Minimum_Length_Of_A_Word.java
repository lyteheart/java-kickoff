package java_basics;

public class Minimum_Length_Of_A_Word {
    public static String minLengthWord(String input){
        String[] splitArr=input.split(" ");
        int minLen=splitArr[0].length();
        String strWord="";
        StringBuilder sb=new StringBuilder();
        for(String val:splitArr){
//            System.out.print(val.length()+" ");
            if(val.length()<minLen){
                minLen=val.length();
                sb.replace(0,sb.length(),val);
            }
        }

        return sb.toString();
    }




    public static void main(String[] args) {
        String str=minLengthWord("abc de ghihjk a uvw h j");
        System.out.println(str);
    }
}
