package arrays;
class MaxSumWithOutAdegency{
   int findMaxSum(int arr[]) {
        
        int[] dp=new int[arr.length];
        
        return find(arr,arr.length-1,dp);
        
    }
    int find(int[] arr,int n,int[] dp){
        
        if(n<0) return 0;
        
        if(n==0) return arr[n];
        
        if(dp[n]!=0) return dp[n];
        int take=arr[n]+find(arr,n-2,dp);
        
        int nottake=0+find(arr,n-1,dp);
        
        dp[n]= Math.max(take,nottake);
        return dp[n];
        
    }
}