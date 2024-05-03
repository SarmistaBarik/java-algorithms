package array;

public class CeilFloor {

    public static void main(String[] args) {

        int[] ar = {3,5,6,8,30,40,55,78};
      //  Arrays.sort(ar);
        int key = 35;
        System.out.println(ceil(ar,key));
        System.out.println(floor(ar,key));
    }

    private static int ceil(int[] ar, int key) {

        int l = 0;
        int h = ar.length-1;
        int mid = 0;

        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                return ar[mid];
            } else if(key < ar[mid]){
                h = mid-1;
            }else{
                l= mid+1;
            }

        }
        if(l< ar.length) {
            return ar[l];
        }else{
            return -1;
        }
    }

    private static int floor(int[] ar, int key) {

        int l = 0;
        int h = ar.length-1;
        int mid = 0;

        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                return ar[mid];
            } else if(key < ar[mid]){
                h = mid-1;
            }else{
                l= mid+1;
            }

        }
        if(h >=0) {
            return ar[h];
        }else{
            return -1;
        }
    }

}
