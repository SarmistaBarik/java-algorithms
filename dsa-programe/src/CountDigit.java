import java.util.Scanner;

public class CountDigit {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countTheDigit(n));
    }

    private static int countTheDigit(int n) {
        int count = 0;
        while (n>0){
            n = n/10;
            count++;
        }
        return count;
    }

}
