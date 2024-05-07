package array;

public class FloorOfSquateRoot {

    public static void main(String[] args) {
        int key = 24;
        System.out.println(floorOfSqrt(key));
    }

    private static int floorOfSqrt(int key) {
        if(key == 1 || key == 0){
            return key;
        }
        int l = 2;
        int h = key/2;
        int mid = 0;
        int res = 0;
        while(l<=h){
           mid = (l+h)/2;

           if(mid * mid == key){
               return mid;
           }
           else if(mid * mid < key ){
               l = mid+1;
               res = mid;
           }
           else{
               h = mid - 1;
               // in case it is ceil then we can store res = mid  here
           }
        }
        return res;
    }


}
