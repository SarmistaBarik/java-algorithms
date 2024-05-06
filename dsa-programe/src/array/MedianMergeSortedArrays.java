package array;

public class MedianMergeSortedArrays {

    public static void main(String[] args) {

        int[] ar1 = {1,3,8,17,18};
        int[] ar2 = {5,6,7,19,21,25,30};

        System.out.println(findMedian(ar1,ar2));
        System.out.println(findMedianLogM(ar1,ar2));
    }
    // time complexity O(log(m+n))
    private static float findMedianLogM(int[] ar1, int[] ar2) {
        if(ar2.length < ar1.length){
            return findMedianLogM(ar2,ar1);
        }

        int l = 0;
        int h = ar1.length;

        while(l<=h){

            int m1 = (l+h)/2;
            int m2 = ((ar1.length+ar2.length+1)/2) -m1;

            int l1 = (m1 == 0) ? Integer.MIN_VALUE : ar1[m1-1];
            int r1 = (m1 == ar1.length) ? Integer.MAX_VALUE : ar1[m1];

            int l2 = (m2 == 0) ? Integer.MIN_VALUE : ar2[m2-1];
            int r2 = (m2 == ar2.length) ? Integer.MAX_VALUE : ar2[m2];

            if(l1 <= r2 && l2<=r1){
                if((ar1.length+ar2.length) % 2 == 0){
                    return (float) (Integer.max(l1, l2) + Integer.min(r1, r2)) /2;
                } else{
                    return (float) Integer.max(l1,l2);
                }
            } else if(l2 > r1){
                l = m1+1;
            } else {
                h = m1 -1;
            }
        }
        return 0.0f;
    }


    // time complexity O(m+n)
    private static float findMedian(int[] ar1, int[] ar2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] m = new int[ar1.length + ar2.length];

        while(i<ar1.length && j < ar2.length && k<=m.length/2){
            if(ar1[i] < ar2[j]){
                m[k] = ar1[i];
                i++;
                k++;
            }else{
                m[k] = ar2[j];
                j++;
                k++;
            }

        }
        while(i < ar1.length && k<=m.length/2){
            m[k] = ar1[i];
            i++;
            k++;
        }
        while(j < ar2.length && k<=m.length/2){
            m[k] = ar2[j];
            j++;
            k++;
        }

        if(m.length % 2 == 0){

            int mid = m.length/2;
            return (float)( m[mid]+m[mid-1])/2;

        }else{
            int mid = m.length/2;
            return m[mid];
        }

    }



}
