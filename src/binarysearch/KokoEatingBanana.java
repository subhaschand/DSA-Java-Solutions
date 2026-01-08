package binarysearch;

public class KokoEatingBanana {
  public int minEatingSpeed(int[] piles, int h) {

        int l=1;

        int r=findMaxNumber(piles);
        int ans=r;


        while(l<=r){

            int m=l+(r-l)/2;
            long time=findTimeTaken(piles,m);

            if(time<=h){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
        
    }
    public long findTimeTaken(int[] piles,int m){

        long count=0;

        for(int i=0;i<piles.length;i++){
            count +=(piles[i]+m-1)/m;
        }
        return count;
    }
    public int findMaxNumber(int[] piles){
        int max=piles[0];

        for(int i=1;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        return max;
    }
  
}
