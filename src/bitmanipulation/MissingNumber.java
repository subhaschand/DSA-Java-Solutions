package bitmanipulation;

public class MissingNumber {
      int missingNum(int arr[]) {
        
        int x1=0,x2=0;
        
        for(int n:arr){
            x1 ^=n;
        }
        for(int j=1;j<=arr.length+1;j++){
            x2 ^=j;
        }
        
        return x2^x1;
    }
  
}
