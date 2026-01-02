package bitmanipulation;

public class FindDublicate {

    public int findDuplicate(int[] arr) {
       
       
       int l=arr.length;
       int xor=0;
       
       for(int n:arr){
           xor ^=n;
       }
       
       for(int i=1;i<=l-1;i++){
           xor ^=i;
       }
       return xor;
        
    }
}
  
