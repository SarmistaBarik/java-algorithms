import java.util.Scanner;

public class ReverseAStringAndPallindrome {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(reverseString(s,"",s.length()-1));

        System.out.println(isPallindrome(s,0 , s.length()-1));
    }

    private static boolean isPallindrome(String s, int i, int j) {

        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        if(j<=i){
            return true;
        }
        return isPallindrome(s,i+1,j-1);
    }

    private static String reverseString(String s, String r, int i) {
        if(i<0){
            return r;
        }
        return reverseString(s,r+s.charAt(i),i-1);



    }


}
