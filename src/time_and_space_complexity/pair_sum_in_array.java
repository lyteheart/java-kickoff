package time_and_space_complexity;

import java.util.Arrays;

public class pair_sum_in_array {

    // first sort
    // then apply two pointer left and right and come by checking
    // if sum is smaller than move left pointer +1 otherwise right -1
    public static int pairSum(int[] arr, int num) {
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum < num)
                left++;
            else if(sum > num)
                right--;
            else{
                if (arr[left]==arr[right]){
                    int totalElements=right-left +1;
                    // pair -> (n*(n-1)) / 2
                    count += (totalElements*(totalElements-1))/2;
                    break;
                }else{
                    int leftValue = arr[left];
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

        return count;

    }

    public static void main(String[] args) {
        System.out.println(pairSum(new int[]{1, 3, 6, 2, 5, 4, 3, 2, 4}, 7));
    }
}
