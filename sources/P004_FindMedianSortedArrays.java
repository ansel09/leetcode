public class P004_FindMedianSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double medianVal = 0.0;
        int m = nums1.length, n = nums2.length, a = 0, b = 0, i = 0;
        int mid =  (m + n) / 2 + 1 ;
        int flag = ((m + n) % 2 == 0) ? 0 : 1;
        while (i < mid ){
            double curr = 0;
            if (a < m && b < n && nums1[a] <= nums2[b]){
                curr = nums1[a];
                a++;
            }
            else if (a < m && b < n && nums1[a] > nums2[b]){
                curr = nums2[b];
                b++;
            } else if (a < m && b >= n){
                curr = nums1[a];
                a++;
            } else if (b < n && a >= m){
                curr = nums2[b];
                b++;
            }
            if (i >= mid - 2 && flag == 0 )  // odd
                medianVal +=  (curr / 2.0);
            if (i == mid - 1 && flag == 1)   // even
                medianVal = curr / 1.0;
            i++;
        }
        return medianVal;
    }
}