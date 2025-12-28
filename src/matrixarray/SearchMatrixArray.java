package matrixarray;

public class SearchMatrixArray {
  public boolean searchMatrix(int[][] mat, int x) {
        
        int l=mat[0].length;
        for(int[]n:mat){
            
            if(n[0]<=x&&n[l-1]>=x){
                return find(n,x);
            }
        }
        return false;
    }
    public boolean find(int[] n,int x){
        
        int l=0;
        int r=n.length-1;
        
        while(l<=r){
            int m=l+(r-l)/2;
            
            if(n[m]==x){
                return true;
            }else if(n[m]<x){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return false;
    }
  
}
