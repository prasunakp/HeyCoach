package SearchingAndSorting;

import java.util.*;
import java.util.stream.Collectors;

public class TheKWeakestRowsinaMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k=3;
        HashMap<Integer,Integer> ans = new HashMap();
        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0)
                    cnt++;
                else
                    break;
            }
            ans.put(i,cnt);
        }
HashMap<Integer,Integer> sortedMap = ans.entrySet().stream().sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        int[] finalAns = new int[k];
        int i=0;
        for (Map.Entry<Integer,Integer> entry : sortedMap.entrySet()) {
           finalAns[i]=entry.getKey();
           i++;
           if(i>=k)
               break;
        }


    }
}
