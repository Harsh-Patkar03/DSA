class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a= nums1.length;
        int b= nums2.length;
        int n= a+b;
        int [] arr= new int [n];
        for (int i = 0 ; i<a ; i++) {
            arr[i]=nums1[i];
        }
        for (int i=0 ; i<b ; i++){
            arr[i+a]=nums2[i];
        }
        Arrays.sort(arr);
        if (n%2==0) return (arr[n/2]+arr[n/2-1])/2.0;
        else return arr[n/2];
    }
}