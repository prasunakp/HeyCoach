package TreeProblems;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagHeyCoach {

    public static void main(String[] args){


    }

    static public List<List<Integer>> zigzagTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
       // LinkedList
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverseOrder = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if (reverseOrder) {
                    currentLevel.add(0, currentNode.val);
                } else {
                    currentLevel.add(currentNode.val);
                }

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            result.add(currentLevel);
            reverseOrder = !reverseOrder;
        }

        return result;
    }
}
