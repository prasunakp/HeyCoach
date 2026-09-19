package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsSubSequence {
    public static void main(String[] args){
        String s = "twn",  t = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn";
        int cnt =0;
        List<Character> cntSeq = new ArrayList<>();

        for(char ch : s.toCharArray()){
            if(t.contains(ch+"")){
                cnt++;
                cntSeq.add(ch);
              t=t.substring(t.indexOf(ch)+1,t.length());
            }
           if(cnt==s.length() ){
               System.out.println("sort sequence ");
           }
        }

    }
}
