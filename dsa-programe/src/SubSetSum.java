public class SubSetSum {

    public static void main(String[] args){

        Integer[] arr = {10,20,15,5,23,2,25};
        System.out.println(countSubset(arr, 25, 0));

    }

    private static int countSubset(Integer[] arr, int sum, int i) {

        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(i==arr.length){
            return 0;
        }
        return countSubset(arr, sum-arr[i], i+1) + countSubset(arr, sum, i+1);

    }
}
