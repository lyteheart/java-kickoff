package java_basics;

public class Maximise_The_Sum {
    public static long maximumSumPath(int[] input1, int[] input2) {
        int i=0,j=0;
        long sum1=0,sum2=0,result=0;

        while (i<input1.length && j<input2.length){
            if(input1[i]<input2[j]){
                sum1+=input1[i];
                i++;
            } else if (input1[i]>input2[j]) {
                sum2+=input2[j];
                j++;
            }else{
                result += Math.max(sum1,sum2)+input1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }

        while(i<input1.length){
            sum1+=input1[i];
            i++;
        }
        while(j<input2.length){
            sum2+=input2[j];
            j++;
        }

        result+=Math.max(sum1,sum2);
        return result;
    }

    public static void main(String[] args) {
        long sum=maximumSumPath(new int[]{1,5,10,15,20,25},new int[]{2,4,5,9,15});
        System.out.println(sum);
    }
}
