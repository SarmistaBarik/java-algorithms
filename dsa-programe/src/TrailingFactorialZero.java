import java.util.Scanner;

public class TrailingFactorialZero {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( trailingZero(n));
    }

    private static int trailingZero(int n) {
        int result = 0;
        int powOf5 = 5;

        while (n>=powOf5){
            result = result + n/powOf5;
            powOf5 = powOf5 *5;
        }
        return result;
    }
}
