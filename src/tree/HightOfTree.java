package tree;

class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}

public class HightOfTree {
  public int height(Node root) {
        
        return find(root);
        
    }
    public int find(Node root){
        
        if(root==null){
            return 0;
        }
        
        int left=find(root.left);
        int right=find(root.right);
        
        return 1+Math.max(left,right);
    }
    


  
}
