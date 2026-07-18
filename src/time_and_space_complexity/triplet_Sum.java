package time_and_space_complexity;

import java.util.Arrays;

public class triplet_Sum {


    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length-2; i++) {
            int fixed = arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right] + fixed;

                if (sum < num)
                    left++;
                else if (sum > num)
                    right--;
                else{
                    if (arr[left]==arr[right]){
                        int leftElements=right-left+1;
                        count+=(leftElements*(leftElements-1))/2;
                        break;
                    }else{
                        int leftValue=arr[left];
                        int leftCount=0;
                        while (left<=right && arr[left]==leftValue){
                            leftCount++;
                            left++;
                        }
                        int rightValue = arr[right];
                        int rightCount = 0;

                        while (left <= right && arr[right] == rightValue) {
                            rightCount++;
                            right--;
                        }

                        count += leftCount*rightCount;

                    }
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(tripletSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 12));
    }
}
