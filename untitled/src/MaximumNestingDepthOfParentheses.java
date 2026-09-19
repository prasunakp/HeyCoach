import java.util.Stack;

public class MaximumNestingDepthOfParentheses {
    //https://www.youtube.com/watch?v=9Qho1zEH3NI
    public static void main(String[] args){
        String s = "(1+(2*3)+((8)/4))+1";
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        int ans =0;
        int maxdepth=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==')'){
                stack.pop();
                ans--;
            }
            else if(arr[i]=='('){
            ans++;
            if(ans>maxdepth){
                maxdepth=ans;
            }
                stack.push(arr[i]);
            }
        }
        System.out.println("ans are "+maxdepth);
    }
}
