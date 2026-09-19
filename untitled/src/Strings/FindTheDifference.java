package Strings;

public class FindTheDifference {
    public static void main(String[] args){
      String  s = "abcd" ,  t = "abcde";
      int sums= 0;
      for(char schar : t.toCharArray()){
          sums+=schar;
      }
      for(char tchar : s.toCharArray()){
          sums-=tchar;
      }
      System.out.println("sum "+(char)sums);
    }
}
