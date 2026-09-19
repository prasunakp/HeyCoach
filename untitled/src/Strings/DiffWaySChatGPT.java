package Strings;

import java.util.ArrayList;
import java.util.List;

public class DiffWaySChatGPT {
    public static void main(String args[]){
        String s= "2-1-1";
        List<String> operands = new ArrayList<>();
        operands.add("+");
        operands.add("-");
        operands.add("*");
       List<Integer> ans = diffWaysToCompute(s,operands);
       for(int a :ans){
           System.out.println("anss is "+a);
       }
    }

    public static List<Integer> diffWaysToCompute(String s,List<String> operands) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            if (operands.contains(s.charAt(i)+"")) {
                List<Integer> left = diffWaysToCompute(s.substring(0, i),operands);
                List<Integer> right = diffWaysToCompute(s.substring(i + 1),operands);
                for (int l : left) {
                    for (int r : right) {
                      result.add(calculateTotal(l,r,s.charAt(i)));
                    }
                }
            }
        }

        if (result.size()==0) {
            result.add(Integer.parseInt(s));
        }

        return result;
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
