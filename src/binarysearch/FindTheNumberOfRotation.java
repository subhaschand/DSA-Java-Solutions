package binarysearch;

public class FindTheNumberOfRotation {
  public int findKRotation(int arr[]) {
        
        int l=0;
        int r=arr.length-1;
        // int min=Integer.MAX_VALUE;
        
        // int index=-1;
        
        // while(l<=r){
        //     int m=l+(r-l)/2;
            
        //     if(arr[l]<=arr[r]){
        //         if(min>arr[l]){
        //             min=arr[l];
        //             index=l;
        //         }
        //         break;
        //     }
        //      if(arr[l]<=arr[m]){
        //         if(min>arr[l]){
        //             min=arr[l];
        //             index=l;
        //         }
        //         l=m+1;
        //     }else{
                
        //         if(arr[m]<min){
        //             min=arr[m];
        //             index=m;
        //         }
        //         r=m-1;
        //     }
        // }
        // return index;
        
        
        
        //this is the second approach to solve the problem by using the simple binary search.
        
        while(l<r){
            
            int m=l+(r-l)/2;
            
            if(arr[m]>arr[r]){
                l=m+1;
            }else{
                r=m;
            }
        }
        return l;
        
    }
  
}
