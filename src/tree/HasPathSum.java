package tree;
public class HasPathSum {
  boolean hasPathSum(Node root, int target) {
        
        if(root==null){
            return false;
        }
        
        if(root.left==null&&root.right==null){
            return target==root.data;
        }
        
        int remi=target-root.data;
        
        return hasPathSum(root.left,remi)||hasPathSum(root.right,remi);
        
    }
  
}
