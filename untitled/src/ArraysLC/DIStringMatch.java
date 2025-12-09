package ArraysLC;

import java.util.Arrays;

public class DIStringMatch {
    //https://www.youtube.com/watch?v=5dsykSZcMzk
    public static void main(String[] args){
String s = "DDI";
int startindex = 0;
int endIndex = s.length();
int[] ans = new int[s.length()+1];
char[] charArray = s.toCharArray();
for(int i=0;i<charArray.length;i++){
    if(charArray[i] == 'I'){
       ans[i]=startindex;
       startindex++;
    }
    if(charArray[i] == 'D'){
       ans[i] = endIndex;
       endIndex--;
    }
}
ans[charArray.length]= endIndex;
System.out.println("ans is "+ Arrays.toString(ans));
    }
}
