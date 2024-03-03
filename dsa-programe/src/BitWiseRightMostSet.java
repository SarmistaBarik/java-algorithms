import java.util.Scanner;

public class BitWiseRightMostSet {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int position =  getPositionRightMostSetBit(n);
       System.out.println(position);

        int positionOptimize =  getPosRightMostSetBitOptimize(n);
        System.out.println(positionOptimize);
    }

    private static int getPosRightMostSetBitOptimize(int n) {

     return (int)( (Math.log10(n ^ ((n & n-1)))/Math.log10(2)) +1);
    }

    private static int getPositionRightMostSetBit(int n) {
        int mask = 1;
        int position = 0;
        if(n == 0){
            return -1;
        }
        while((n & mask) == 0){
            mask = mask << 1;
            position++;
        }
        return position+1;
    }
}
