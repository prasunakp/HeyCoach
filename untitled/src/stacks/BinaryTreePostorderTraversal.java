package stacks;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class BinaryTreePostorderTraversal {
    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left=n2;
        n2.right=n3;
        List<Integer> ans = new ArrayList<>();

calculatePostOrder(n1,ans);

System.out.println("ans "+ans);
    }

    private static List<Integer> calculatePostOrder(TreeNode n1, List<Integer> ans) {

        if(n1.left!=null)
        calculatePostOrder(n1.left,ans);
        if(n1.right!=null)
        calculatePostOrder(n1.right,ans);
        ans.add(n1.val);
        return ans;
    }
}
