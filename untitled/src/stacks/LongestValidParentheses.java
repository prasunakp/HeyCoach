package stacks;
//https://www.youtube.com/watch?v=vURq_xYGr-k
//when
public class LongestValidParentheses {
    public static void main(String[] args){
        String s = "()";
        int left =0;
        int right =0;
        int max = 0;
//closed braces are more than the open braces reset the counter and compare with the max value
        // this for loop is required to cover ")()"
        for(char ch : s.toCharArray()){

            if(ch=='(')
                left++;
            if(ch==')')
                right++;
            if(left==right && left*2>max)
                max=left*2;
            if(right>left){
                left=0;
                right=0;
            }

        }
left=0;
        right=0;
        //left side orphan is covered.
        //this for loop is required to cover "(()" reverse the string and porefom the same logic as above
        for(char ch : new StringBuilder(s).reverse().toString().toCharArray()){

            if(ch=='(')
                left++;
            if(ch==')')
                right++;
            if(left==right && left*2>max)
                max=left*2;
            if(left>right){
                left=0;
                right=0;
            }
        }
        System.out.println("ans is "+max);
    }
}
