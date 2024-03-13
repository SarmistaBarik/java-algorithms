import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( factorialResult(n));

        System.out.println( factorialResultRecursion(n));
    }

    private static int factorialResultRecursion(int n) {

        if(n == 0 || n == 1){
            return 1;
        }
        return n *  factorialResultRecursion(n-1);
    }

    private static int factorialResult(int n) {
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        return result;
    }
}
