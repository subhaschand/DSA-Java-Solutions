package arrays;

public class RotateArray {
      public void rotate(int[] nums, int k) {
        
        int l=nums.length;
        
        k=k%l;
        

        rotateTheArray(nums,0,l-1);
        rotateTheArray(nums,0,k-1);
        rotateTheArray(nums,k,l-1);
        
    }
    public void rotateTheArray(int[] nums,int l,int r){
        
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
        
        
    }
  
}
