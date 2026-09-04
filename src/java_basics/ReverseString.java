package java_basics;

public class ReverseString {
    public static String stringReverse(char[] arr) {
        char[] a = new char[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            a[index++] = arr[i];
        }

        return new String(a);

    }







    public static void main(String[] args) {
        char[] arr=new char[]{'s','o','u','v','i','k'};
        String str = stringReverse(arr);
        System.out.println(str);

    }
}
