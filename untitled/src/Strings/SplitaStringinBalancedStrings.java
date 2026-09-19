package Strings;

public class SplitaStringinBalancedStrings {
    int i=0;
    public static void main(String[] args){
      String s = "LLLLRRRR";
      int cntOfL=0;
      int cntOfR=0;
      int cnt=0;
      for(int i=0;i<=s.length()-1;i++){
         if(s.charAt(i)=='L')
             cntOfL++;
         if(s.charAt(i)=='R')
             cntOfR++;
         if(cntOfL==cntOfR){
             cnt++;
             cntOfL=0;
             cntOfR=0;
         }
      }
      System.out.println("ans "+cnt);
    }
}
