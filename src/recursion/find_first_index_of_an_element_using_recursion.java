package recursion;

public class find_first_index_of_an_element_using_recursion {
    public static int firstIndexUsingIndex(int input[], int x,int index) {
        if(x<0 || index>input.length-1){
            return -1;
        }
        if (input[index]==x){
            return index;
        }
        return firstIndexUsingIndex(input,x,index+1);
    }
    public static int firstIndex(int input[], int x) {
        return firstIndexUsingIndex(input,x,0);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{9,8,10,8};
        int isFound=firstIndex(arr,0);
        System.out.println(isFound);
    }
}
