package TreeProblems;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateTheNodes {

    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(34);
        root.left.right = new TreeNode(5);

        List<String> values = new ArrayList<>();

        collectValues(root, values);
        for(String val : values){
            System.out.print(" "+val);
        }
        String largestNumber = getLargestNumber(values);
        System.out.println("Largest number formed by concatenating node values: " + largestNumber);

    }

    private static void collectValues(TreeNode root, List<String> values) {
        if (root == null) return;


        values.add(String.valueOf(root.val));
        collectValues(root.left, values);
        collectValues(root.right, values);
    }

    private static String getLargestNumber(List<String> values) {
        values.sort((a, b) -> (b + a).compareTo(a + b));

        // If the highest number is "0", the whole number is zero
        if (values.get(0).equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String s : values) {
            result.append(s);
        }
        return result.toString();
    }

}
