package Strings;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=u_Zmx9cLHjk
public class GenerateParenthesis {
    public static void main(String[] args){
        int n=3;
        List<String> ans = new ArrayList<>();
        getParenthesis(ans,0 , 0 ,n,new StringBuffer());
        for(String ans1 : ans){
            System.out.println("ans is "+ans1);
        }
    }

    public static List<String>  getParenthesis(List<String> ans, int openCnt, int closeCnt, int size, StringBuffer currentans){
        if(currentans.length()==2*size){
            ans.add(currentans.toString());
            return ans;
        }
        if(closeCnt<openCnt){
            getParenthesis(ans,openCnt,closeCnt+1,3,new StringBuffer(currentans).append(")"));
        }
        if(openCnt<size) {
            getParenthesis(ans, openCnt + 1, closeCnt, 3, new StringBuffer(currentans).append("("));
        }

        return ans;
    }
}
