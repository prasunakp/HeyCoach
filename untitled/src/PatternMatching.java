import java.util.ArrayList;

public class PatternMatching {

    public static void main (String[] args) {
        String text = "ababcabab";
        String pattern = "ab";
        ArrayList<Integer> countList = new ArrayList<>();
        char[] strArray = text.toCharArray();
        for(int i =0;i<strArray.length;i++){
            int cnt=0;
           for(int j=i, k=0;j<strArray.length && k<pattern.length();j++,k++) {
                   if (strArray[j] == pattern.charAt(k)) {
                       cnt++;
                   }
               if(cnt==pattern.length()){
                   countList.add(i);
               }
           }
        }
        for(int count : countList){
            System.out.println(count);
        }
    }
}
