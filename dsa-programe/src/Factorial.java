import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( factorialResult(n));
    }

    private static int factorialResult(int n) {
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        return result;
    }
}
