package stacks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNode {
    public int val;
    public List<ListNode> children;

    public ListNode() {}

    public ListNode(int _val) {
        val = _val;
    }

    public ListNode(int _val, List<ListNode> _children) {
        val = _val;
        children = _children;
    }
}
public class NArrayTreePostOrderTraversal {

    public static void main(String[] args){

        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);

        List<ListNode> n2list = new ArrayList<>();
        n2list.add(n4);
        n2list.add(n5);

        ListNode n1 = new ListNode(3,n2list);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);

        List<ListNode> n1list = new ArrayList<>();
        n1list.add(n1);
        n1list.add(n2);
        n1list.add(n3);

        ListNode root = new ListNode(1,n1list);

        List<Integer> ans = new ArrayList<>();

        calculateAns(root,ans);

            System.out.println("ans "+ans);


    }
   public static List<Integer> calculateAns(ListNode root,List<Integer> ans){
    if(root.children==null){
        ans.add(root.val);
        return ans;
    }
       ans.add(root.val);
for(ListNode child : root.children) {
    calculateAns(child,ans);
}

return ans;
    }

}
