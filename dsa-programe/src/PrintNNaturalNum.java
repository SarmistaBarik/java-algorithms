import java.util.Scanner;

public class PrintNNaturalNum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        nNaturalNumber(n);
    }

    private static void nNaturalNumber(int n) {

        if(n == 0){
            return ;
        }
        nNaturalNumber(n-1);
        System.out.println( n);

    }
}
