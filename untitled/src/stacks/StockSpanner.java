package stacks;

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {

    List<Integer> ansList;

    public StockSpanner() {
        ansList = new ArrayList<>();
    }

    public int next(int price) {
        int cnt =0;
        ansList.add(price);
     for(int i=ansList.size()-1;i>=0;i--){
         if(price>=ansList.get(i)) {
             cnt++;
         }
         else
             return cnt;
     }

        return cnt;
    }
}
