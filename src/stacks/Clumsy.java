package stacks;
import java.util.*;
public class Clumsy {
  public int clumsy(int n) {
        Stack<Integer>st=new Stack<>();


        st.push(n);
        n=n-1;
        int i=0;
        while(n>0){

            if(i==0){
                st.push(st.pop()*n);
                n--;
                i++;
            }else if(i==1){
                st.push(st.pop()/n);
                n--;
                i++;
            }else if(i==2){
                st.push(n);
                n--;
                i++;
            }else{
                st.push(-n);
                n--;
                i=0;
            }
            
        }
        int ans=0;
        while(!st.isEmpty()){
            ans +=st.pop();
        }
        return ans;
    }
  
}
