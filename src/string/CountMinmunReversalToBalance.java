package string;

public class CountMinmunReversalToBalance {

      public int countMinReversals(String s) {
        
        if(s.length()%2!=0)return -1;

        int open=0;
        int close=0;

        for(char c:s.toCharArray()){

          if(c=='}'){
            open +=1;
          }else{
            if(open>0){
              open -=1;
            }else{
              close +=1;
            }
          }
        }
        return (open+1)/2+(close+1)/2;
        
    }
  
}
