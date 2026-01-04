package tree;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class Inorder {

      public ArrayList<Integer> inOrder(Node root) {
        
        ArrayList<Integer> result=new ArrayList<>();
        
        find(root,result);
        return result;
        
    }
    public void find(Node root,ArrayList<Integer> result){
        
        if(root==null){
            return;
        }
        find(root.left,result);
        result.add(root.data);
        find(root.right,result);
    }
  
}
