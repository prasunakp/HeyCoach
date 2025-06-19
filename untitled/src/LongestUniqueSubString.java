import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubString {
    public static void main (String[] args){
        String s  = "Heycoachsuper30";
        String s1 = "";
        char[] strArray = s.toCharArray();
        int size =0;
        HashMap<Integer,Integer> mapIndex = new HashMap<>();

        for(int i =0;i<strArray.length;i++){

    HashMap<Character,Integer> map = new HashMap<>();
    for(int j =i;j<strArray.length;j++){
        if(map.get(strArray[j])==null){
            map.put(strArray[j],1);
            if ((j==strArray.length-1) && (size < (strArray.length-i))){
                mapIndex.clear();
                mapIndex.put(i, strArray.length);
                size=strArray.length-i;
                break;
            }
        }

      else if (size < (j-i)){
            mapIndex.clear();
            mapIndex.put(i,j);
            size=j-i;
            break;
        }
        else{
            break;
        }
    }

}

     for(Map.Entry<Integer,Integer> entry : mapIndex.entrySet()){
         for(int k = entry.getKey();k<entry.getValue();k++){
             s1 += strArray[k];
         }
     }
System.out.println("String is "+s1);
    }
}
