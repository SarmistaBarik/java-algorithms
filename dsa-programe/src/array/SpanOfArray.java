package array;

import java.util.Arrays;

public class SpanOfArray {

    public static void main(String[] args) {

        int[] ar = {3,5,6,8,50,30,55,40,78};
        System.out.println(span(ar));
    }

    private static int span(int[] ar) {

        int min = ar[0];
        int max = ar[0];
        for(int i = 0 ; i< ar.length ; i++){
            if(ar[i] > max){
                max = ar[i];
            }
            if(ar[i] < min){
                min = ar[i];
            }
        }
        return max-min;
    }

}
