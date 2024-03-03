import java.util.Scanner;

public class CountSetBit {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int countSet = getCountSet(n);
        System.out.println(countSet);



    }

    private static int getCountSet(int n) {

        int count = 0;

        while(n>0) {
            n = n & (n - 1);
            count ++;
        }

        return count;
    }
}
