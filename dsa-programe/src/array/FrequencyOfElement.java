package array;

public class FrequencyOfElement {
    public static void main(String args[]){
       // Integer[] arr = {20,20,30,30,30,30,40};
      Integer[] arr = {20,20,30,30,30,30};
        //Integer[] arr = {20};
        frequency(arr);

    }

    private static void frequency(Integer[] a) {
        int freq =1;
        int i = 1;
        for( i =1; i<a.length; i++)
        {
            if(a[i] ==  a[i-1])
            {
                freq++;
            }
            else {
                System.out.println(a[i-1] + " " + freq);
                freq=1;
            }
        }

        System.out.println(a[i-1] + " " + freq);
    }

}
