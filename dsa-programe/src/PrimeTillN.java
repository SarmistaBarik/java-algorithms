import java.util.Scanner;

public class PrimeTillN {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //printPrime(n);
        sievePrintPrime(n);
        
    }

    private static void sievePrintPrime(int n) {
      boolean[] primeArray =  new boolean[n+1];
        for(int i = 2; i*i<=n ; i++){   // instead on n we can take root n
            if(!primeArray[i]){
                for(int j = i*i ;j<=n ; j = j+i){ // 2*i replaced with i square
                    primeArray[j] = true;
                }
            }
        }
        for(int i = 2 ; i<= n ; i++){
            if(!primeArray[i]){
                System.out.println(i);
            }
        }
    }

    private static void printPrime(int n) {

        for(int j = 2; j<=n ; j++){
            if(checkPrime(j)){
                System.out.println(j);
            }
        }
    }

    private static boolean checkPrime(int n) {

        if(n==1){
           return false;
        }
        if(n== 2 || n== 3){
            return true;
        }
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for(int i = 5 ; i<= Math.sqrt(n) ; i= i+6){

            if (n % i == 0 || n%(i+2)== 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int n) {
// changed from n/2 to sqrt of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
