import java.util.Scanner;

public class Divisors {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDivisors(n);

    }

    private static void printDivisors(int n) {
        int i = 0;
        for( i=1; i*i<=n;i++){// changed from i<n to i*i<n to get 1 pair of divisor
            if(n%i==0 && i!= n/i){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }


}
