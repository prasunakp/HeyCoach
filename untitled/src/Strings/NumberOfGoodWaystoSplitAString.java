package Strings;

import java.util.HashSet;
import java.util.Set;
//https://www.youtube.com/watch?v=UVfpK3dNGKE
public class NumberOfGoodWaystoSplitAString {
    public static void main(String[] args){
        String s = "abcd";
        int[] prefixArray = new int[s.length()];
        int[] suffixArray = new int[s.length()];

        populateArray(s,prefixArray,suffixArray);
int ans =0;
        for(int i=0;i<prefixArray.length-1;i++){
            if(prefixArray[i]==suffixArray[i+1]){
               ans++;
            }
        }
System.out.println("ans is "+ans);
    }

  public static void  populateArray(String s,int[] prefix,int[] suffix){
        int cnt =0;
        int scnt=0;
        Set<Character> prefixSet = new HashSet<>();
        Set<Character> suffixSet = new HashSet<>();
        for(int i=0,j=s.length()-1; i<s.length()&&j>=0;i++,j--){
            if(prefixSet.contains(s.charAt(i))){
                prefix[i]=cnt;
            }
            else {
                prefix[i] = cnt+1;
                cnt++;
            }
            if(suffixSet.contains(s.charAt(j))){
                 suffix[j]=scnt;
            }
            else {
                suffix[j] = scnt+1;
                scnt++;
            }
            prefixSet.add(s.charAt(i));
            suffixSet.add(s.charAt(j));
        }
    }
}
