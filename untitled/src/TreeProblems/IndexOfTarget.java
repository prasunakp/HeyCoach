package TreeProblems;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class IndexOfTarget {

    public static void main(String[] args){

        TreeNode root = new TreeNode(4);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(7);

root.left = n1;
root.right = n2;
n1.left = n3;
n1.right = n4;
n2.left = n5;
n2.right = n6;
int target = 3;
int count = 1;
        List<Integer> elements = new ArrayList<>();
        elements = inorderTraversal(root,elements);
        System.out.println("ans is "+elements);
/*for(Integer i : elements){
    if(i == target)
      //  return count;
    else
       // return count++;
}*/

    }

    private static List<Integer> inorderTraversal(TreeNode root, List<Integer> elements) {
        if(root.left == null || root.right == null){
            elements.add(root.val);
            return elements;
        }
        inorderTraversal(root.left,elements);
        elements.add(root.val);
        inorderTraversal(root.right,elements);

        return  elements;
    }
}
