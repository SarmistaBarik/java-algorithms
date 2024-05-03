package array;

public class IndexOfStartAndEndOfElement {

    public static void main(String[] args) {

      //  int[] ar = {3,5,6,8,30,40,40,40,55,78};

        int[] ar = {3,4,4,4,4,4,4,4,4,6};
      //  Arrays.sort(ar);
        int key = 3;
        System.out.println(index(ar,key));
    }

    private static int[] index(int[] ar, int key) {

        int l = 0;
        int h = ar.length-1;
        int mid = 0;
        int[] res = {-1,-1};
        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                res[0] = mid;
                h = mid-1;
            } else if(key > ar[mid]){

                l= mid+1;
            }else{
                h = mid-1;
            }

        }
         l = 0;
         h = ar.length-1;
         mid = 0;
        while(l<=h){

            mid = (l+h)/2;

            if(key == ar[mid]){
                res[1] = mid;
                l = mid+1;
            } else if(key > ar[mid]){

                l= mid+1;
            }else{
                h = mid-1;
            }

        }
        System.out.println(""+res[0] +" "+ res[1]);
        return res;
    }

}
