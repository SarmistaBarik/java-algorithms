package array;

import java.security.Key;

public class LinearSearch {

    public static void main(String[] args) {

        int[] ar = {50,30,55,6,40,78};
        int key = 40;
        System.out.println(linearSearch(ar,key));
    }

    private static int linearSearch(int[] ar, int key) {

        for(int i = 0 ; i< ar.length; i++){
            if(ar[i] == key){
                return i;
            }

        }
        return -1;
    }

}
