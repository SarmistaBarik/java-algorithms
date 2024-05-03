package array;

public class BitonicElement {

    public static void main(String[] args) {

        int[] ar = {3,5,6,8,30,10,8,7};
      //  Arrays.sort(ar);
        int key = 8;

        int bIndex = findBitonicPoint(ar);
        System.out.println(bIndex);

        int result = searchBitonic(ar,key ,bIndex);
        System.out.println(result);
    }

    private static int binarySearchAscending(int[] ar, int key, int range) {

        int l = 0;
        int h = range;
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

    private static int binarySearchDescending(int[] ar, int key,int range) {

        int l = range;
        int h = ar.length-1;
        int mid = 0;

        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                return mid;
            } else if(key < ar[mid]){
                l = mid+1;
            }else{
                h= mid-1;
            }

        }
        return -1;
    }

    private static int findBitonicPoint(int[] ar){

        int l = 0;
        int r = ar.length-1;
        int mid = 0;

        while(l<=r){
            mid = (l+r)/2;

            if(ar[mid] > ar[mid-1] && ar[mid] > ar[mid+1]){
                return mid;
            } else if(ar[mid] > ar[mid-1] && ar[mid] < ar[mid+1]){
                l = mid;
            }else{
                r = mid;
            }
        }
        return -1;
    }

    private static int searchBitonic(int[] ar , int key, int bIndex){

        if(key == ar[bIndex]){
        return bIndex;
        }else if(key > ar[bIndex]){
            return -1;
        }
       int res1 =  binarySearchAscending(ar,key,bIndex-1);
        if(res1 != -1){
           return res1;
        }
      int res2 =  binarySearchDescending(ar,key,bIndex+1);
        if(res2 != -1){
            return res2;
        }
        return -1;
    }
}
