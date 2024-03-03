import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean isPow = isAPower(n);
        System.out.println(isPow);



    }

    private static boolean isAPower(int n) {

        boolean isPow = false;
        if(n == 0){
           isPow = false;
        }
        isPow = (n & (n-1)) == 0;

        return isPow;
    }
}
