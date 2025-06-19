package ProblemSolving;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharactersFrequency {

    public static void main(String[] args){
        String s = "Mississippi";
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Sort characters by frequency, then lexicographically
        List<Character> chars = new ArrayList<>(freqMap.keySet());
        chars.sort((a, b) -> {
            if (!freqMap.get(a).equals(freqMap.get(b))) {
                return freqMap.get(b) - freqMap.get(a); // Sort by frequency (descending)
            }
            return a - b; // Sort lexicographically if frequency is the same
        });

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(String.valueOf(c).repeat(freqMap.get(c)));
        }
       System.out.println("result "+result);
    }
}
