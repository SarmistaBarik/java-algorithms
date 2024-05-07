package array;

public class RemoveDuplicate {

    public static void main(String args[]){
        Integer[] arr = {1,1,2,2,3,3,4,5,6,6};
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " " + " ");
        }
       int val =  removeDuplicate(arr);
        System.out.println();
        for (int i = 0;i <val;i++) {
            System.out.print(arr[i] + " " + " ");
        }
    }

    private static int removeDuplicate(Integer[] arr) {
            int rd = 0;
            for (int i = 1;i < arr.length;i++){
                if(arr[rd] != arr[i]){
                    rd++;
                    arr[rd] = arr[i];
                }
            }

            return rd+1;

    }
}
