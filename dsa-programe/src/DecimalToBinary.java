import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  binary = decimalToBinary(n);
        int result = binaryToDecimal(binary);
    }

    private static int binaryToDecimal(String binary) {

        int result = 0;
        int powOf2 = 1;

        for(int i = binary.length()-1 ; i>=0; i--){
            if(binary.charAt(i) == '1'){
                result = result+ powOf2;
            }
            powOf2 = powOf2 * 2;
        }
        System.out.println(result);
        return result;
    }

    private static String decimalToBinary(int n) {

        String b = "";
        while(n>=1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        System.out.println(b);
        return  b;
    }
}

