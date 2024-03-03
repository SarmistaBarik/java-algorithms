public class BitWise {

    public static void main(String[] args){

        int n = 36;
        int i = 3;
        int onMask = 1<<i;
        //on mask with or operator and mask with 1
        System.out.println( n | onMask);

        int j = 5;
        int offMask = ~(1 << j);

        //off mask with and operator and mask with 1
        System.out.println( n & offMask);
        // toggle using XOR ^
        int tMask = 1 << j;
        System.out.println( n ^ tMask);

        //check if a given position is on or off.

        if((n & tMask) == 0)
        {
            System.out.println( "OFF");
        }else{
            System.out.println( "ONN");
        }

    }
}
