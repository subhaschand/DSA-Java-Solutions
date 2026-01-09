package tree;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderTreversal {
   public ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<Node> s1 = new Stack<>(); // left to right
        Stack<Node> s2 = new Stack<>(); // right to left

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            // Process s1 (left → right)
            while (!s1.isEmpty()) {
                Node curr = s1.pop();
                result.add(curr.data);

                if (curr.right != null) s2.push(curr.right);
                if (curr.left != null) s2.push(curr.left);
            }

            // Process s2 (right → left)
            while (!s2.isEmpty()) {
                Node curr = s2.pop();
                result.add(curr.data);

                if (curr.left != null) s1.push(curr.left);
                if (curr.right != null) s1.push(curr.right);
            }
        }

        return result;
    }

  
}
