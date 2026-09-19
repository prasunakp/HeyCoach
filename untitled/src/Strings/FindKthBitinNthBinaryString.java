package Strings;

public class FindKthBitinNthBinaryString {
    public static void main(String[] args){
        int n=1;
        int k=1;
        String prev = "0";
        String ans="";
       ans= calculateString( prev,1,n,ans);
       System.out.println("ans "+(ans==""?0:ans.charAt(k-1)));
       System.out.println(0);
    }

    public static String calculateString(String prev, int c ,int n,String ans){
        if(c==n){
            return ans;
        }
       ans = prev+"1"+new StringBuffer(calculateReverse(prev)).reverse();
        prev=ans;
       return calculateString(prev,c+1,n,ans);
    }

    private static String calculateReverse(String prev) {
        char[] charArray = prev.toCharArray();
        for(int i=0;i<charArray.length;i++){
            charArray[i] = (char) (prev.charAt(i)^1);
        }
        return new String(charArray);
    }
}
