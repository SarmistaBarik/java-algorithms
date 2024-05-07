package array;

public class MinBouquetsDay {

    public static void main(String[] args) {

        int[] ar = {2,5,2,9,3,10,4,6,5,6};
        int boq = 4;
        int flowers = 2;
        System.out.println(minDayBouquet(ar,boq,flowers));
    }

    private static int minDayBouquet(int[] ar, int boq, int flowers) {

        if(boq*flowers > ar.length){
            return -1;
        }

        int l = ar[0];
        int  h = ar[0];
        int m = 0;
        int res = -1;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] < l){
                l = ar[i];
            }
            if(ar[i] > h){
                h = ar[i];
            }
        }
        while(l <= h){
           m = (l+h)/2;
           if(isPossibleSol(ar,boq,flowers,m)){
                res = m;
                h = m-1;
            }else{
               l = m+1;
           }
        }
       return res;
    }


    private static boolean isPossibleSol(int[] a, int boq, int flowers, int m) {

        int adj = 0;
        int bc = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] <= m){
                adj++;
                if(adj == flowers){
                    bc++;
                    if(bc == boq){
                    return true;
                    }
                    adj = 0;
                }
            } else{
                adj = 0;
            }
        }
        return false;
    }

}
