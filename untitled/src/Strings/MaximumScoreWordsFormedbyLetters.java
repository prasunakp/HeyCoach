package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class MaximumScoreWordsFormedbyLetters {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "dad", "good"};
        //Character[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //List<Character> charList = Arrays.asList(charArray);
        int[] score = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        HashMap<Character, Integer> letterMap = new HashMap<>();
        char[] letters = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        for (char ch : letters) {
            letterMap.put(ch, letterMap.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<words.length;i++){
        //calculateSum()
        }
    }
   // public int calculateSum()
}
