package test.classes;

import java.util.*;

public class NonRepetingCharecter {

    public static void main(String[] args){
        String str = "assadfgdfga";

       // ArrayList<Character> list = new ArrayList<>();
        StringBuilder outputStr = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            queue.offer(ch);

            while (!queue.isEmpty() && charCount.get(queue.peek()) > 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                outputStr.append('X');
            } else {
                outputStr.append(queue.peek());
            }
        }


        System.out.println("anser is "+outputStr.toString());
    }
}
