package array;

public class secondSmallestElement {


    public static void main(String[] args) {

        int[] ar = {3,5,6,8,50,30,55,40,78};
        System.out.println(secondSmallest(ar));
    }

    private static int secondSmallest(int[] ar) {

        int min1 = 0;
        int min2 = 0;
        if(ar[0]< ar[1]){
            min1 = ar[0];
            min2 = ar[1];
        } else{
            min1 = ar[1];
            min2 = ar[0];
        }

        for(int i = 2; i< ar.length;i++){

            if(ar[i] < min1){
                min2= min1;
                min1 = ar[i];
            }else if(ar[i] < min2){
                min2 = ar[i];
            }

        }
        return min2;
    }
}
