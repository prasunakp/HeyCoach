import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args){

        String s = "acbbccddede";
        int k =2;
        int length =0;

        char[] stringArray = s.toCharArray();
        for(int l=0;l<stringArray.length;l++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int r = l; r < stringArray.length; r++) {
                map.put(stringArray[r], 1);
                if (map.size() > k) {
                    int size = r - l - 1;
                    if (size > length) {
                        length = size;

                    }
                    break;
                }
            }
            if (map.size() == k) {
                int size = stringArray.length - l ;
                if (size > length) {
                    length = size;
                }
            }
        }
    System.out.println("length is "+length);
    }
}
