package DivideAndConquer;
//https://www.youtube.com/watch?v=TsNk71XjTGs
public class MaximumBinaryTree {
   public static void main(String[] args){
       int[] nums ={3,2,1,6,0,5};
    TreeNode tree = calculateMaximumBinaryTree(0,nums.length-1,nums);

   }

    private static TreeNode calculateMaximumBinaryTree(int start, int end, int[] nums) {
       if(start>end)
           return  null;
       int maxindex=0;
       int maxNum = Integer.MIN_VALUE;
       for(int i=start;i<=end;i++) {
           if (nums[i] > maxNum) {
               maxindex = i;
               maxNum = nums[i];
           }
       }
        TreeNode root = new TreeNode(maxNum);
        root.left=calculateMaximumBinaryTree(start,maxindex-1,nums);
        root.right=calculateMaximumBinaryTree(maxindex+1,end,nums);
        return root;
    }

}
