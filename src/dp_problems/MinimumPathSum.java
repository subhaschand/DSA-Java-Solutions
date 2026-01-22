package dp_problems;

import java.util.Arrays;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] n:dp){
            Arrays.fill(n,-1);
        }

        return find(0,0,grid,dp);
    }
    public int find(int i,int j,int[][] grid,int[][] dp){

        if(i>=grid.length||j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1&&j==grid[0].length-1){
            return grid[i][j];
        }

        if(dp[i][j]!=-1)return dp[i][j];

        int first=find(i+1,j,grid,dp);
        int second=find(i,j+1,grid,dp);

        dp[i][j]=grid[i][j]+Math.min(first,second);

        return dp[i][j];
    }
  
}
