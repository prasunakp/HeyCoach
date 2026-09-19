package math;

import java.util.*;
import java.util.stream.Collectors;

public class MatrixCellsinDistanceOrder {
    public static void main(String[] args){
        int rows=2;
        int cols=2;
        int rcentre=0;
        int ccentre=1;
        HashMap<String,Integer> ans= new HashMap<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
              ans.put(i+","+j,Math.abs(i-rcentre)+Math.abs(j-ccentre));

            }
        }
     List<Map.Entry<String,Integer>> ansList = new ArrayList<>(ans.entrySet());
       ansList.sort(Map.Entry.comparingByValue());
       int[][] ansArray = new int[rows*cols][2];
      int index=0;
       for(Map.Entry<String,Integer> val: ansList) {
           ansArray[index][0] = Integer.valueOf(val.getKey().split(",")[0]);
           ansArray[index][1]=Integer.valueOf(val.getKey().split(",")[1]);
           index++;
       }
    }
}
