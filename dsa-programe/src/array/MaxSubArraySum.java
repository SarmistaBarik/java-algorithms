package array;

import static java.lang.Math.max;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Integer[] a = {5,6,-3,7,-13,8,-2,5,2,-1,-2,-1};
        System.out.println(getMaxSubArraySum(a));
    }

    private static int getMaxSubArraySum(Integer[] a) {
        int sum = a[0];
        int maxSum = a[0];

        for(int i = 1; i<a.length;i++){
            if(sum >= 0){
                sum = sum+a[i];
            }else{
                sum = a[i];
            }
            maxSum = max(sum,maxSum);
            }
        return maxSum;
    }
}
