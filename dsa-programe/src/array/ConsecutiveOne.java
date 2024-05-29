package array;

import static java.lang.Math.max;

public class ConsecutiveOne {
    public static void main(String args[]){

        Integer[] arr = {1,1,1,1,0,1,0,0,0,1,1,1,1,1,1,0};

        System.out.println(maxConsOne(arr)) ;
        System.out.println(maxConsOneEfficient(arr)) ;
    }

    private static int maxConsOneEfficient(Integer[] arr) {
        int count = 0;
        int maxCount = 0;

        for(int i = 0 ; i<arr.length;i++){

                if(arr[i] == 0){
                    count = 0;
                }else{
                    count++;
                }
            maxCount = max(count,maxCount);
        }
        return maxCount;
    }


    private static int maxConsOne(Integer[] arr) {

        int count ;
        int maxCount = 0;

        for(int i = 0 ; i<arr.length;i++){
            count = 0;
            for(int j = i ; j < arr.length;j++){
                if(arr[j] == 1){
                    count++;
                }else{
                    break;
                }
            }
           // System.out.println(count);
            maxCount = max(count,maxCount);
        }
        return maxCount;
    }
}

