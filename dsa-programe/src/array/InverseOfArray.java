package array;

public class InverseOfArray {
    public static void main(String args[]){
        Integer[] arr = {2,3,1,0,4};
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        int[] val =  inverseOfArray(arr);
        System.out.println();
        for (int i = 0;i <val.length;i++) {
            System.out.print(val[i] + " ");
        }

    }

    private static int[] inverseOfArray(Integer[] arr) {
        int[] b = new int[arr.length];

        for(int i = 0 ; i <arr.length ; i++){
           int v = arr[i];
           b[v] = i;
        }
        return b;
    }
}
