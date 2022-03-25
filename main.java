class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length,i=0,j=0;
        double curr1=0,curr2=0;
            while(i+j<=(n1+n2)/2){
                curr1=curr2;
                if(i>=n1){
                    curr2=nums2[j];
                    j++;
                }
                else if(j>=n2){
                    curr2=nums1[i];
                    i++;
                }
                else if(nums1[i]>nums2[j]){
                    curr2=nums2[j];
                    j++;
                }
                else{
                    curr2=nums1[i];
                    i++;
                }
            }
        double med=(n1+n2)%2==0?(curr1+curr2)/2.0:curr2;
        return med;
    }
}