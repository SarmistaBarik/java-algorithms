package array;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] ar = {3,5,6,8,30,40,55,78};
        int key = 40;
        System.out.println(binarySearch(ar,key));
    }

    private static int binarySearch(int[] ar, int key) {

        int l = 0;
        int h = ar.length-1;
        int mid = 0;

        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                return mid;
            } else if(key < ar[mid]){
                h = mid-1;
            }else{
                l= mid+1;
            }

        }
    return -1;
    }

}
