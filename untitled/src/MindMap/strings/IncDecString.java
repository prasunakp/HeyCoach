package MindMap.strings;

import java.util.Arrays;

public class IncDecString {

    public static void main(String[] args){

        String s = "aaaabbbbcccc";
        String result = "";
        char[] charArr = s.toCharArray();
        int[] cnt = new int[26];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            cnt[s.charAt(i) - 'a']++;
        }

    }
}
