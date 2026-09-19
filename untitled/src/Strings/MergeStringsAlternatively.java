package Strings;

public class MergeStringsAlternatively {
    public static void main(String[] args){
        String word1 = "ab";
        String word2 = "pqrs";
        StringBuffer ans = new StringBuffer();
        int greaterLength = word2.length()>word1.length()?word2.length():word1.length();
        for(int i=0;i<greaterLength;i++){
           if((word1.length()-1)>=i && (word2.length()-1)>=i){
               ans.append(word1.charAt(i)).append(word2.charAt(i));
           }
           else if ((word1.length()-1)>=i)
               ans.append(word1.charAt(i));
           else
               ans.append(word2.charAt(i));
        }
System.out.println("ans is "+ans);
    }
}
