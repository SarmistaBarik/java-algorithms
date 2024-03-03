import java.util.Scanner;

public class LengthOfConsecutive1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isConsecutive = isConsecutive(n);
        System.out.println(isConsecutive);
        int count = getConsecutiveCount(n);

        System.out.println(count);



    }

    private static int getConsecutiveCount(int n) {
        int count = 0;
        while(n>0){
           n =  (n & (n << 1));
           count++;
        }
        return count;
    }

    static boolean isConsecutive(int n){

        return (n & (n << 1)) != 0;
    }
}
