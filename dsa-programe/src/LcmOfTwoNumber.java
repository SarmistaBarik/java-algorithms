import java.util.Scanner;

public class LcmOfTwoNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        bruteForceSol1(a, b);
        lcmByEuclideSolution(a,b);

      //  gabrielLameSolution(a,b);
    }

    private static void lcmByEuclideSolution(int a, int b) {
        System.out.println("LCM is " + (a*b)/euclideGCD(a,b));

    }

    private static int euclideGCD(int a, int b) {

        while(a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a!= 0) {
            System.out.println("GCD or HCF is " + a);
            return a;
        }else{
            System.out.println("GCD or HCF is " + b);
            return b;
        }
    }


    private static void bruteForceSol1(int a, int b) {
        int result = Math.max(a,b);
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        while(true){

            if(result % a == 0 && result % b == 0){
                break;
            }
            result++;
        }
        System.out.println("result is "+ result);
    }


}
