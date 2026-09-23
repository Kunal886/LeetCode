class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
         int i=m-1,j=n-1;
       int k=m+n-1;
       int [] arr=new int[m+n];
       while(i>=0 && j>=0){
        if(nums1[i]>nums2[j])
        arr[k--]=nums1[i--];
       
       else
       arr[k--]=nums2[j--];
    }
    while (i >= 0) {
    arr[k--] = nums1[i--];
     }
    while(j>=0){
        arr[k--]=nums2[j--];
    }

    if(arr.length%2==0){
        return (arr[arr.length/2-1]+arr[arr.length/2])/2.0;
    }
    else
       return arr[arr.length/2];

    }
}