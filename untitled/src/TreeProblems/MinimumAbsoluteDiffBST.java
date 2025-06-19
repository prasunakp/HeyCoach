package TreeProblems;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDiffBST {

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(-12);
        TreeNode n2 = new TreeNode(-13);
        TreeNode n3 = new TreeNode(-14);
     //   TreeNode n4 = new TreeNode(3);
     //   TreeNode n5 = new TreeNode(5);
      //  TreeNode n6 = new TreeNode(7);

        root.left = n1;
        n1.left = n2;
        n2.left = n3;
      //  n1.right = n4;
      //  n2.left = n5;
      //  n2.right = n6;
        List<Integer> elements = new ArrayList<>();
        elements = inorderTraversal(root,elements);
        int minAbsDiff = Integer.MAX_VALUE;
         for(int i =0;i<elements.size();i++){
             if((i+1) < elements.size() && minAbsDiff > Math.abs(elements.get(i)-elements.get(i+1))){
                 minAbsDiff = Math.abs(elements.get(i)-elements.get(i+1));
             }
         }
         System.out.println("ans is "+minAbsDiff);
    }

    private static List<Integer> inorderTraversal(TreeNode root, List<Integer> elements) {
        if(root!=null && root.left == null && root.right == null){
            elements.add(root.val);
            return elements;
        }
        if(root!=null) {
            inorderTraversal(root.left, elements);
            elements.add(root.val);
            inorderTraversal(root.right, elements);
        }
        return  elements;
    }
}
