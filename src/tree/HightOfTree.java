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

    //if your solving this in gfg then they choose the root node has 0 ,soo you should return answer with minuse (-1),otherwise the normal answer is okayy. 
        
        return find(root)-1;
        
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
