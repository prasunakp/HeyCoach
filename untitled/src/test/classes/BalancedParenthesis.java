package test.classes;

import java.util.HashSet;
import java.util.Stack;

public class BalancedParenthesis {
  static  int cnt;
    public static void main(String[] args){

        int n =3;
        Stack<String> ans = new Stack<>();
   //  HashSet<String> e =  new HashSet<>();
   int  e=balancedparenthesis(ans,0,0,n);
     System.out.print("answer is"+e);
    }
   static int balancedparenthesis(Stack<String> ans, int open, int closed,int n){
if(open == n && closed == n) {

    return cnt++;
}
if(open<n) {
    ans.push("(");
    balancedparenthesis(ans, open + 1, closed, n);
    ans.pop();
}
if(closed<open) {
    ans.push(")");
    balancedparenthesis(ans, open, closed + 1, n);
    ans.pop();
}
return cnt;
    }
}
