import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalToBinary(n);
    }

    private static void decimalToBinary(int n) {

        String b = "";
        while(n>=1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        System.out.println(b);

    }
}
