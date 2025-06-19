import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarsMission {

    public static void main(String[] args){
        String s = "badef";
        String vowels = "aeiou";
        List<String> stringList = new ArrayList<>();
        char[] strArray = s.toCharArray();
        int j = strArray.length-1;

        while(j>=0){
            String s1 = "";
         if(vowels.contains(""+strArray[j])){
           for(int i=j-1;i<=j;i++){
               s1 += strArray[i];
           }
             j=j-2;
          }
         else{
             for(int i=j-2;i<=j;i++){
                 s1 += strArray[i];
             }
             j = j-3;
         }
            stringList.add(s1);
        }
        Collections.reverse(stringList);
        stringList.stream().forEach(x->System.out.print(x+" "));
    }
}
