import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllElementArray {

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr,0));
    }

    private static int sum(int[] arr, int i) {

        if(i == arr.length){
            return 0;
        }
        return sum(arr , i+1) +arr[i];
    }


}
