package dp_problems;
public class MinimumCoins {
      public int minCoins(int coins[], int sum) {
        
        int[][] dp=new int[coins.length][sum+1];
        
        for(int[] n:dp){
            Arrays.fill(n,-1);
        }
        
        int ans=find(coins,sum,coins.length-1,dp);
        
        return (ans>=(int)1e9)?-1:ans;
        
    }
    public int find(int[] coins,int t,int i,int[][] dp){
        
        if(i==0){
            if(t%coins[i]==0){
                return t/coins[i];
            }else{
                return (int)1e9;
            }
        }
        
        if(dp[i][t]!=-1)return dp[i][t];
        
        int not_take=find(coins,t,i-1,dp);
        
        int take=(int)1e9;
        
        if(coins[i]<=t){
            take=1+find(coins,t-coins[i],i,dp);
        }
        
        return dp[i][t]=Math.min(not_take,take);
    }
  
}
