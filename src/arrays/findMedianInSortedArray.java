package arrays;
public class findMedianInSortedArray {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int nums1Length=nums1.length;
        int nums2Length=nums2.length;

        double m1=0,m2=0;
        int i=0,j=0;
        for(int c=0;c<=(nums1Length+nums2Length)/2;c++){
            m2=m1;
            if(i!=nums1Length&&j!=nums2Length){
                if(nums1[i]<=nums2[j]){
                    m1=nums1[i];
                    i++;
                }else{
                    m1=nums2[j];
                    j++;
                }
            }else if(i<nums1Length){
                m1=nums1[i];
                i++;
            }else{
                m1=nums2[j];
                j++;
            }
        }

        if((nums1Length+nums2Length)%2==1){
            return m1;
        }

        return (m1+m2)/2;
    }
}