package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leftViewOfTree {
   public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        
        
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            int num=0;
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                if(i==0){
                    num=temp.data;
                }
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                
            }
            result.add(num);
        }
        return result;
    }
}
