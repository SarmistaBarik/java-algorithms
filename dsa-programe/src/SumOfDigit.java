import java.util.Scanner;

public class SumOfDigit {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumOfDigitRecursion(n));
    }

    private static int sumOfDigitRecursion(int n) {
        if(n == 0){
            return 0;
        }
      return sumOfDigitRecursion(n/10) + (n % 10);

    }

}
