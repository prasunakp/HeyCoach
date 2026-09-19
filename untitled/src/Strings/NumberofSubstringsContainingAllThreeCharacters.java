package Strings;

public class NumberofSubstringsContainingAllThreeCharacters {

    public static void main(String[] args){
        String s = "abcabc";
        int[] arr = {-1,-1,-1};
        int cnt =0;
       for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'a'] =i;
           if(arr[0]!=-1 && arr[1]!= -1 && arr[2]!=-1){
            cnt = cnt+1+Math.min(arr[0],Math.min(arr[1],arr[2]));
           }
       }
       System.out.println("vaLUE "+cnt);
    }


}
