package tree;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}



public class SumTree {
  boolean isSumTree(Node root) {
        
        return check(root)!=-1;
        
    }
    int check(Node root){
        
        if(root==null){
            return 0;
        }
        
        if(root.left==null&&root.right==null){
            return root.data;
        }
        
        int leftsum=check(root.left);
        int rightsum=check(root.right);
        
        
        if(leftsum==-1||rightsum==-1){
            return -1;
        }
        if(root.data!=leftsum+rightsum){
            return -1;
        }
        
        return root.data+leftsum+rightsum;
    }

  
}
