package basicproblems;

public class AmstrongNumber {

      static boolean armstrongNumber(int n) {
        

        int num=n;
        int d=0;

        while(num>0){
          d +=1;
          num /=10;
        }
        num=n;
        int ans=0;

        while(num>0){
          int r=num%10;
          ans +=Math.pow(r,d);
          num /=10;
        }
        
        return ans==n; 
        
    }
  
}
