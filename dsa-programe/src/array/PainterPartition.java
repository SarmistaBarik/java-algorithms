package array;

public class PainterPartition {

    public static void main(String[] args) {

        int[] ar = {10,20,30,40};
        int a = 2;
        int b = 2;
        System.out.println(maxWork(ar,a,b));
    }

    private static int maxWork(int[] ar, int a ,int b) {

     int l = 0;
     int h = 0;
     int res = -1;
     for(int i = 0;i <ar.length; i++){
             h = h+ar[i];
         }
        while(l <= h){
            int m = (l+h)/2;
            if(isPossibleSol(ar, a, m)){
                res = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }
        return res*b;
    }

    private static boolean isPossibleSol(int[] ar, int a, int m) {

        int painter = 1;
        int pbc = 0;

        for(int i = 0; i < ar.length; i++){
            if(ar[i] > m){
               return false;
            }
            if(pbc+ar[i] <= m){
                pbc = pbc +ar[i];
            } else{
                painter++;
                if(painter > a){
                   return false;
                }
                pbc = ar[i];
            }
        }
        return true;
    }

}
