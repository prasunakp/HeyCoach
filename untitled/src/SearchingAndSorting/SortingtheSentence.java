package SearchingAndSorting;

import java.util.HashMap;
import java.util.Map;

public class SortingtheSentence {
    public static void main(String[] args){
       String s = "is2 sentence4 This1 a3";
       String[] sArray = s.split(" ");
       HashMap<Integer,String> ansMap = new HashMap<>();
       for(int i=0;i<sArray.length;i++){
           String sMap = sArray[i];
           ansMap.put(Integer.valueOf(sMap.substring(sMap.length()-1)),sMap.substring(0,sMap.length()-1));
       }
       s= "";
for(Map.Entry<Integer,String> entry:ansMap.entrySet()){
    s+= entry.getValue()+" ";
}
System.out.println("String is "+s.trim());
    }
}
