package recursion;

public class replace_character_recursion {
    public static String replaceCharacterUsingIndex(String input, char c1, char c2,int index) {
        if(index==input.length())
            return "";

        String smallOutput=replaceCharacterUsingIndex(input,c1,c2,index+1);
        if(input.charAt(index)!=c1){
            return input.charAt(index) + smallOutput;
        }else{
            return c2 + smallOutput;
        }
    }

    public static String replaceCharacter(String input, char c1, char c2) {
        return replaceCharacterUsingIndex(input,c1,c2,0);
    }

    public static void main(String[] args) {
        String res=replaceCharacter("axbxcdrx",'x','y');
        System.out.println(res);
    }
}
