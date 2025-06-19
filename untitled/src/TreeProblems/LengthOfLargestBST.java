package TreeProblems;

public class LengthOfLargestBST {
    static int cnt =0;

    static class Info{
        int size;     // Size of subtree
        int max;      // Max value in subtree
        int min;      // Min value in subtree
        int ans;      // Size of largest BST
        boolean isBST;

        Info(int size, int min, int max, int ans, boolean isBST) {
            this.size = size;
            this.min = min;
            this.max = max;
            this.ans = ans;
            this.isBST = isBST;
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(8);
        TreeNode n5 = null;
     //   TreeNode n6 = new TreeNode(7);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = null;
        n2.left = null;
        n2.right = n4;

        Info ans = countlargestBST(root);
        System.out.println("answer is"+ans.size);

       // System.out.println("answer is "+cnt);
    }

    private static Info countlargestBST(TreeNode root) {
       if(root == null){
           return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0,true);
       }
       if(root.left == null && root.right == null){
           return new Info(1, root.val, root.val, 1,true);
       }
       Info left = countlargestBST(root.left);
       Info right = countlargestBST(root.right);

       if(left.isBST && right.isBST && left.max < root.val && right.min > root.val){
           int min = Math.min(root.val, right.min);
           int max = Math.max(root.val, left.max);
           return new Info(left.size+ right.size+1,min,max,left.size+ right.size+1,true );
       }
       return new Info(Math.max(left.ans, right.ans),0,0,0,false);
    }


}
