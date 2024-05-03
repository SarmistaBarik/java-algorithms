package array;

public class WoodCuttingArray {

    public static void main(String[] args) {

        int[] ar = {20,15,10,17};
      //  Arrays.sort(ar);
        int key = 8;
        System.out.println(machineHeight(ar,key));
    }

    private static int machineHeight(int[] ar, int key) {


        int maxHight = 0;
        for(int i = 0; i< ar.length;i++){

            if(ar[i] > maxHight){
                maxHight = ar[i];
            }
        }

        int l = 0;
        int h = maxHight;
        int mid = 0;

        while(l<=h){

            mid = (l+h)/2;

           int wc =  findWoodCount(ar,mid);

           if(wc == key || l == mid){
               return mid;
           }
           else if(wc > key){
               l = mid;
           }else {
               h = mid;
           }


        }
    return -1;
    }

    private static int findWoodCount(int[] ar ,int mid) {
        int wc = 0;
        for(int i = 0 ; i< ar.length;i++){
            if(ar[i] > mid){
                wc = wc+ (ar[i]-mid);
            }
        }
return  wc;
    }

}
