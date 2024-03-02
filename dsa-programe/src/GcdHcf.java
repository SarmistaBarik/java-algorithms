import java.util.Scanner;

public class GcdHcf {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        bruteForceSol1(a, b);
        euclideSolution(a,b);
        gabrielLameSolution(a,b);
    }

    private static void gabrielLameSolution(int a, int b) {

        while(a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a!= 0) {
            System.out.println("GCD or HCF is " + a);
        }else{
            System.out.println("GCD or HCF is " + b);
        }
    }

    private static void euclideSolution(int a, int b) {
       while(a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("GCD or HCF is "+a);
    }

    private static void bruteForceSol1(int a, int b) {
        int min = 0;
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        if(a < b){
           min = a;
        }else{
            min = b;
        }
        System.out.println("min is "+min);
        for(int i = min; i>=1; i--){
            System.out.println("i is "+i);
            if(a %i == 0 && b %i == 0){
                System.out.println("GCD or HCF is "+i);
                break;
            }
        }
    }


}
