package arrays;

class SingleNumber {
      public int singleNumber(int[] nums) {
        
        int a=0;
        
        for(int n:nums){
            a ^=n;
        }
        
        return a;
        
        
    }
}
