import java.util.HashMap;
import java.util.Map;

public class MinWindSubString {

    public static void main(String[] args) {
        String s = "abccde";
        String t = "abcd";
        String s1 = "";
        Map<Character, Integer> targetCount = new HashMap<>();
        HashMap<Character, Integer> mapindex = new HashMap<>();

        for (char c : t.toCharArray()) {
            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
        }

        char[] strArray = s.toCharArray();
        int startIndex = 0;
        int endIndex = strArray.length + 1;
        for (int i = 0; i < strArray.length; i++) {
            mapindex.clear();
            for (int j = i; j < strArray.length; j++) {
                if (t.contains("" + strArray[j])) {
                    mapindex.put(strArray[j], mapindex.getOrDefault(strArray[j], 0) + 1);
                }
                if (checkIfCountMatches(mapindex, targetCount) && (j - i) <= (endIndex - startIndex)) {
                    startIndex = i;
                    endIndex = j;
                    break;
                }
            }
        }
        for (int k = startIndex; k <= endIndex; k++) {
            s1 += strArray[k];
        }
        System.out.println("String is "+s1);
    }

    private static boolean checkIfCountMatches(HashMap<Character, Integer> mapindex, Map<Character, Integer> targetCount) {
      int cnt =0;
        for(Character c : targetCount.keySet()){

          if(mapindex.get(c)!=null && mapindex.get(c)>=targetCount.get(c)){
              cnt++;
          }
      }
        return (cnt == targetCount.size());
    }
}

