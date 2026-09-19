package Strings;

import java.util.*;
import java.util.stream.Collectors;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        String s = "rat";
        String ans = "";
        HashMap<Character, Integer> ansMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            ansMap.put(ch, ansMap.getOrDefault(ch, 0) + 1);
        }
        List<Character> sortedList = new ArrayList<>(ansMap.keySet().stream().sorted().toList());
        sortedList.addAll(ansMap.keySet().stream().sorted(Collections.reverseOrder()).collect(Collectors.toCollection(ArrayList::new)));
          while(  !sortedList.isEmpty()) {
              Iterator<Character> iterator = sortedList.iterator();
              while (iterator.hasNext()){
                  char ch = iterator.next();
              if (ansMap.get(ch) > 0) {
                  ans += ch;
                  ansMap.put(ch, ansMap.get(ch) - 1);
              } else {
                  iterator.remove();
              }
          }
          }

    System.out.println("ans is "+ans);
    }
}
