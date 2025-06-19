import java.util.HashMap;

public class OccurencesOfAnagram {

    public static void main (String[] args){
        String str = "aabaabaa";
        String chr = "aaba";
        int count = 0;
        HashMap<Character,Integer> chars = new HashMap<>();
        HashMap<Character,Integer> strchars = new HashMap<>();
        for(Character c : chr.toCharArray() ){
             chars.put(c,chars.getOrDefault(c, 0) + 1);
        }
        for(int  i =0; i<=(str.toCharArray().length-chr.length()) ;i++){
            strchars.clear();
            int j= 0;
              while( j <chr.length()) {
                  strchars.put(str.charAt(i+j), strchars.getOrDefault(str.charAt(i+j), 0) + 1);
                  if (countMapSize(strchars, chars)) {
                      count++;
                  }
                  j++;
              }
        }
        System.out.print("value is "+count);
    }

    private static boolean countMapSize(HashMap<Character, Integer> strchars, HashMap<Character, Integer> chars) {
     int cnt =0;
      for(Character c : chars.keySet()){
          if(strchars.get(c)==chars.get(c)){
             cnt++;
          }
        }

        return (cnt==chars.size());
    }
}
