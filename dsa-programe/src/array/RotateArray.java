package array;

public class RotateArray {

    public static void main(String args[]){
        Integer[] arr = {1,2,3,4,5};
        int k = 7;
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i]  + " ");
        }
       rotateArray(arr, k);
        System.out.println();
        for (int i = 0;i <arr.length ;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverse(Integer[] arr, int start, int end) {

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }


    private static void rotateArray(Integer[] arr, int k) {
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
       /* THIS IS NOT OPTIMAL SOL. O(k*n)
        for (int i = 1 ; i <= k ; i++ ){
            rotateArrayby1(arr);
        }*/
        // below is O(n)
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void rotateArrayby1(Integer[] arr) {
            int temp  = arr[0];
            for (int i = 1;i < arr.length;i++){
               arr[i-1] = arr[i];
            }
                arr[arr.length -1] = temp;


    }
}
