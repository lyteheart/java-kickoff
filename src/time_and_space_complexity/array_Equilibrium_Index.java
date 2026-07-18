package time_and_space_complexity;

public class array_Equilibrium_Index {
    public static int arrayEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        int i = 0;
        while (i < arr.length) {
            totalSum += arr[i];
            i++;
        }
        int index=0;
        int leftSum=0;
        while (index<arr.length){
            int rightSum=totalSum-leftSum-arr[index];
            if (rightSum==leftSum){
                return index;
            }
            leftSum=leftSum+arr[index];
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{2, 3, 10, -10, 4, 2, 9};
        int[] arr = new int[]{1, 4, 9, 3, 2};
        System.out.println(arrayEquilibriumIndex(arr));
    }
}
