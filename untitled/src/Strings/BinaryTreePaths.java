package Strings;

import TreeProblems.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public static void main(String[] args){

        TreeNodeString leaf1 = new TreeNodeString(5,null,null);
        TreeNodeString leaf2 = new TreeNodeString(3,null,null);
        TreeNodeString t1 = new TreeNodeString(2,null,leaf1);
        TreeNodeString root = new TreeNodeString(1,t1,leaf2);
        List<String> ans = new ArrayList<>();

       ans= calculatePath(root,ans,"");
       for(String an : ans){
           System.out.println("value is"+an);
       }
    }

    private static List<String> calculatePath(TreeNodeString root, List<String> ans,String path) {
        if(root.left==null && root.right==null){
                path= path.isEmpty()?""+root.val+"":path+"->"+root.val;
                ans.add(path);
                return ans;
        }
        if(root.left!=null)
        calculatePath(root.left,ans,path.isEmpty()?""+root.val+"":path+"->"+root.val);
        if(root.right!=null)
        calculatePath(root.right,ans,path.isEmpty()?""+root.val+"":path+"->"+root.val);
        return ans;
    }

}
