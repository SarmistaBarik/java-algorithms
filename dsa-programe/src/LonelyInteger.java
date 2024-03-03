import java.util.Arrays;
import java.util.HashSet;

public class LonelyInteger {

    public static void main (String[] args){

        int[] ar = {2, 3, 4, 5, 6, 5, 4, 3, 2};

        int result = bfaFindLonelyInteger(ar);
        System.out.println(result);

        int result1 = findLonelyIntegerUsingSet(ar);

        System.out.println(result1);

        int result2 = findLonelyIntegerUsingXOR(ar);

        System.out.println(result1);
    }

   //most optimized way
    private static int findLonelyIntegerUsingXOR(int[] ar) {
        int result = 0;
        for(int i : ar){
            result = result ^ i;
        }
        return result;
    }

    private static int findLonelyIntegerUsingSet(int[] ar) {

        HashSet<Integer> mySet = new HashSet<>();

        for(int i : ar){
            if(mySet.contains(i)){
                mySet.remove(i);
            }else{
                mySet.add(i);
            }
        }
        for(int j : mySet){
            return j;
        }
        return -1;
    }

    private static int bfaFindLonelyInteger(int[] ar) {
        Arrays.sort(ar);
        for(int i = 0;i <= ar.length-2; i=i+2){

            if(ar[i] != ar[i+1]){
                return ar[1];
            }
        }
        return ar[ar.length-1];
    }
}
