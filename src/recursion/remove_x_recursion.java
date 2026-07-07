package recursion;

public class remove_x_recursion {

    public static String removeX(String input) {
        if(input.length()==1)
            return "";
        String smalloutput=removeX(input.substring(1));
        if(input.charAt(0)=='x'){
            return smalloutput;
        }else{
            return input.charAt(0) + smalloutput;
        }
    }

    public static void main(String[] args) {
        String res=removeX("axbxcdrx");
        System.out.println(res);
    }
}
