import java.util.Arrays;

public class MovingZeroToEnd {

    public static void main(String args[]){

        //Integer[] arr = {1,2,0,67,5,0,4,0};
       // Integer[] arr = {1,2,0,67,5,0,4,0};
        Integer[] arr = {1,1,1,1,0,1,0,0,0};

        if(arr.length == 0 || arr.length ==1 ){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int nz = 0;
        int z = 0;
        while(nz<arr.length) {
            if (arr[nz] !=0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;

            } else {
                nz++;
            }
        }
        System.out.println(Arrays.toString(arr));
//moving zero to front
        int nz1 = 0;
        int z1 = 0;
        while(z1<arr.length) {
            if (arr[z1] ==0) {
                int temp = arr[z1];
                arr[z1] = arr[nz1];
                arr[nz1] = temp;
                nz1++;
                z1++;

            } else {
                z1++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
