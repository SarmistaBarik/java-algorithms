package array;

public class BookAllocation {

    public static void main(String[] args) {

        int[] ar = {12,34,67,90};
        int key = 2;
        System.out.println(maxPage(ar,key));
    }

    private static int maxPage(int[] a, int b) {

     if(b > a.length){
            return -1;
     }

     int l = a[0];
     int h = 0;
     int res = -1;
     for(int i = 0;i <a.length; i++){
         if(a[i] < l){
             l = a[i];
         }else{
             h = h+a[i];
         }
        while(l <= h){
            int m = (l+h)/2;
            if(isPossibleSol(a, b, m)){
                res = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }
     }
        return res;
    }

    private static boolean isPossibleSol(int[] a, int b, int m) {

        int student = 1;
        int spc = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] > m){
               return false;
            }
            if(spc+a[i] <= m){
                spc = spc +a[i];
            } else{
                student++;
                if(student > b){
                   return false;
                }
                spc = a[i];
            }

        }
        return true;
    }

}
