package array;

public class CountSmallerOrEqual {

    public static void main(String[] args) {

        int[] ar = {3,5,6,8,30,40,40,40,55,78};
      //  Arrays.sort(ar);
        int key = 50;
        System.out.println(countSmallAndEqualElement(ar,key));
    }

    private static int countSmallAndEqualElement(int[] ar, int key) {

        int l = 0;
        int h = ar.length-1;
        int mid = 0;

        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                while(mid+1 < ar.length && ar[mid+1]== key){
                mid++;
                }
                break;
            } else if(key < ar[mid]){
                h = mid-1;
            }else{
                l= mid+1;
            }

        }

        if(ar[mid] >key){
            return  mid;
        }else {
            return mid + 1;
        }
    }

}
