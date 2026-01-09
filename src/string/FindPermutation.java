package string;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPermutation {
  public ArrayList<String> findPermutation(String s) {
        
        ArrayList<String> ans=new ArrayList<>();
        
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        
        boolean[] flag=new boolean[arr.length];
        
        find(arr,new StringBuilder(),ans,flag);
        
        return ans;
    }
    public void find(char[] arr,StringBuilder curr,ArrayList<String> ans,boolean[] flag){
        
        if(curr.length()==arr.length){
            ans.add(curr.toString());
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(flag[i]) continue;
            
            if(i>0&&arr[i]==arr[i-1]&&!flag[i-1]) continue;
            
            flag[i]=true;
            
            curr.append(ch);
            find(arr,curr,ans,flag);
            curr.deleteCharAt(curr.length()-1);
            flag[i]=false;
            
            
        }
    }
  
}
