package TreeProblems;


import com.sun.source.tree.Tree;

public class ZigZagProblem {

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode rl1= new TreeNode(20);
        TreeNode rr1 = new TreeNode(9);

        TreeNode rl2 = new TreeNode(15);
        TreeNode rl3 = new TreeNode(7);

        root.left = rl1;
        root.right = rr1;
        rl1.left = rl3;
        rl1.right = rl2;

        int ans = Math.max(solve(root.left,true,1),solve(root.right,false,1));
System.out.print("ans is"+(ans+1));

    }
    int maxlength = 0;
   static int solve(TreeNode root , boolean isleft, int curLength ){
        if(root.left == null && root.right == null){
            return curLength;
        }
        if(isleft)
       return  solve(root.right,false,curLength+1);
        else
       return     solve(root.left,true,curLength+1);

        //return curLength;
    }
}
