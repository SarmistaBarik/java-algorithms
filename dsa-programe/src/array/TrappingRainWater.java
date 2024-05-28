package array;

public class TrappingRainWater {

    public static void main(String args[]){
        Integer[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapRainWater(arr)) ;

    }

    private static int trapRainWater(Integer[] arr) {

        int lhb = arr[0] ;
        int rhb = arr[arr.length-1];
        int res = 0;
        int l = 0;
        int r = arr.length-1;

        while(l <= r){
            if(lhb <= rhb){
               if(arr[l] >= lhb){
                   lhb = arr[l];
               }else{
                   res = res + lhb - arr[l];

               }
                l++;
            } else{
                if(arr[r] >= rhb){
                    rhb = arr[r];
                }else{
                    res = res + rhb - arr[r];
                   

                }
                r--;
            }

        }
        return res;
    }
}
