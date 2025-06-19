import java.util.*;

public class CountOccrences {

    public static void main(String[] args){
        String s = "ssgysyqa";
        StringBuilder s1 = new StringBuilder();
        HashMap<Character,Integer> maping = new HashMap<>();

        for(char c : s.toCharArray()){
int count = 0;
for(int i=0;i<s.toCharArray().length;i++){
    if(c == s.charAt(i)){
        count++;
    }
}
maping.put(c,count);
        }
        List<Map.Entry<Character, Integer>> carList = new ArrayList<>(maping.entrySet());
Collections.sort(carList,(entry1,entry2)->{
    int freqcomp = entry2.getValue()-entry1.getValue();
    if(freqcomp  == 0){
        return entry1.getKey() - entry2.getKey();
    }
    return  freqcomp;
});
      for(Map.Entry<Character,Integer> entry : carList){
         for(int i =0;i<entry.getValue();i++){
             s1.append(entry.getKey());
         }
      }
      System.out.println(s1);
    }
}
