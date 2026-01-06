package basicproblems;

public class SqureRoot {
    
  public int mySqrt(int x) {
        //As the sqrt of the number 1 and 0 are 1 and 0;
        if(x==0||x==1)return x;

        return findSqrtUsingBinary(x);
        
    }
    public int findSqrtUsingBinary(int n){

        int l=1;
        int num=n;
        int r=num/2;
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            //use the long has explicit type conversion to reduce the overflow;
            if((long)m*m<=n){
                ans=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return ans;
    }
 
}    
