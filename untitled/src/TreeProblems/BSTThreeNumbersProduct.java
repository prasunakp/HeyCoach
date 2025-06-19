package TreeProblems;

import java.util.ArrayList;
import java.util.List;

public class BSTThreeNumbersProduct {

    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = null;
        TreeNode n6 = new TreeNode(7);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        n2.right = n6;
        int target = 60;
        List<Integer> elements = new ArrayList<>();
        elements = inorderTraversal(root,elements);
        for(int i =0;i<elements.size();i++){
            for(int j =i+1;j<elements.size();j++){
                for(int k=j+1;k<elements.size();k++ ){
                    if(elements.get(i)*elements.get(j)*elements.get(k) == target)
                        System.out.println("true");
                    break;
                }
            }
        }

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
