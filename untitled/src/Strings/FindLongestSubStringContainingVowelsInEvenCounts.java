package Strings;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubStringContainingVowelsInEvenCounts {

    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
String s = "ee";
        int mask = 0;
        int maxLength = 0;

        map.put(0, 0);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a') mask = mask^(1 << 0);
            else if (c == 'e') mask ^= (1 << 1);
            else if (c == 'i') mask ^= (1 << 2);
            else if (c == 'o') mask ^= (1 << 3);
            else if (c == 'u') mask ^= (1 << 4);

            if (map.containsKey(mask)) {
                maxLength = Math.max(maxLength, i - map.get(mask)+1);
            } else {
                map.put(mask, i);
            }
        }
System.out.println("ans is "+maxLength);
    }
}
