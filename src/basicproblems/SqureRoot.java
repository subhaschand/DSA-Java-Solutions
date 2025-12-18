package basicproblems;

public class SqureRoot {
  int floorSqrt(int n) {
        
        return binarySearch(n);
        
    }
    public int binarySearch(int n){
        
        int l=1;
        int r=n;
        
        int res=1;
        while(l<=r){
            
            int m=l+(r-l)/2;
            
            if(m*m<=n){
                res=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return res;
    }
  
}
