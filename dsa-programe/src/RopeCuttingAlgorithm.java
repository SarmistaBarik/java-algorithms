public class RopeCuttingAlgorithm {

    public static void main(String[] args){

        System.out.println(maxPices(15,5,8,7));

    }

    private static int maxPices(int n, int a, int b, int c) {

        if(n== 0){
            return 0;
        }else if(n< 0){
            return -1;
        }

        int temp1 = maxPices(n-a,a,b,c);
        int temp2 = maxPices(n-b,a,b,c);
        int temp3 = maxPices(n-c,a,b,c);

        int maxPices = Math.max(temp1, Math.max(temp2,temp3));
        if(maxPices == -1){
            return -1;
        }
    return maxPices+1;
    }
}
