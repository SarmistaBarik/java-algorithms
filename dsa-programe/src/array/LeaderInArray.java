package array;

public class LeaderInArray {
    public static void main(String args[]){
        Integer[] arr = {8,11,5,11,7,6,3};
        leaderArray(arr);

    }

    private static void leaderArray(Integer[] arr) {

        for(int i = 0 ; i <arr.length ; i++){
            boolean isLeader = true;

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] >= arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.println(arr[i]);
            }
        }

    }
}
