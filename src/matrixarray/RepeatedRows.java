package matrixarray;

import java.util.*;
public class RepeatedRows {
   public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
        ArrayList<Integer> answer=new ArrayList<>();
        
        Set<String>store=new HashSet<>();
        int count=0;
        for(int arr[]:matrix){
            
            String st=ConvertToString(arr);
            if(store.contains(st)){
                answer.add(count);
            }
            store.add(st);
            count +=1;
            
            
        }
        return answer;
    }
    public static String ConvertToString(int[] arr){
        
        StringBuilder sb=new StringBuilder();
        for(int n:arr){
            sb.append(n).append(",");
        }
        return sb.toString();
    }
  
}
