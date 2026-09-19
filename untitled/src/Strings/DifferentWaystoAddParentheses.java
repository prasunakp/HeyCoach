package Strings;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/different-ways-to-add-parentheses/description/
public class DifferentWaystoAddParentheses {
    public static void main(String[] args){
        String s = "2*3-4*5";
        List<Integer> ans1 = new ArrayList<>();
        List<String> operands = new ArrayList<>();
        operands.add("+");
        operands.add("-");
        operands.add("*");
        ans1 = calculateSum(s,operands);
        for(int s1 : ans1){
            System.out.println("ands i s "+s1 );
        }
    }

    private static List<Integer> calculateSum(String s,List<String> operands) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if (operands.contains(s.charAt(i) + "")) {
                List<Integer> leftSum = calculateSum(s.substring(0, i), operands);
                List<Integer> rightSum = calculateSum(s.substring(i + 1), operands);
                for (int lsum : leftSum) {
                    for (int rsum : rightSum) {
                        ans.add(calculateTotal(lsum, rsum, s.charAt(i)));
                    }
                }
            }
        }
          if(ans.size()==0){
            ans.add(Integer.parseInt(s));
          }

        return ans;
    }

    private static Integer calculateTotal(int lsum, int rsum, char c) {
        switch (c) {
            case '+':
                return lsum+rsum;
            case '-':
                return lsum-rsum;
            case '*':
                return lsum*rsum;
        }
        return 0;
    }
}
