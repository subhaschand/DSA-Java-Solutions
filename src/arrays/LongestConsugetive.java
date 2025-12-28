package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsugetive {

      public int longestConsecutive(int[] arr) {

        if(arr.length==0)return 0;

        Set<Integer> st=new HashSet<>();

        for(int n: arr){
          st.add(n);
        }
        
        int answer=0;
        int number=0;
        int streak=0;

        for(int num:arr){

          if(!st.contains(num-1)){
            number=num;
            streak=1;

            while(st.contains(number+1)){
              number +=1;
              streak +=1;
            }
          }

          answer=Math.max(answer,streak);
        }

        return answer;
        
        
    }
  
}
