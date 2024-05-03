package array;

public class RotatedArraySearch {

    public static void main(String[] args) {

        //int[] ar = {3,5,6,8,30,40,55,78};
        int[] ar = {40,55,78,3,5,6,8,30};
      //  Arrays.sort(ar);
        int key = 40;
        System.out.println(rotatedArrayBinarySearch(ar,key));
    }

    private static int rotatedArrayBinarySearch(int[] ar, int key) {

        int l = 0;
        int h = ar.length-1;
        int mid = 0;

        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                return mid;
            } else if(ar[l] <= ar[mid]) {
                if (key < ar[mid] && key >= ar[l]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else{
                if(key > ar[mid] && key <= ar[h]){
                    l = mid+1;
                }
                else{
                    h = mid -1;
                }
            }

        }
    return -1;
    }

}
