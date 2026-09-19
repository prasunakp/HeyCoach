package ArraysLC;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOfLine {
    public static void main(String[] args){
        int[][] points = {{4,5},{4,-1},{4,0}};
        int maxValue =  Integer.MAX_VALUE;
        int count =0;
            for (int i = 0; i < points.length; i++) {
                HashMap<Double,Integer> countMap = new HashMap<>();
                for (int j = i+1; j < points.length; j++) {
                    if(points[j][0]==points[i][0]){
                        countMap.put(maxValue+0.0,countMap.getOrDefault(maxValue+0.0,0)+1);
                    }
                    else{
                      double slope= (double) (points[j][1]-points[i][1])/(points[j][0]-points[i][0]);
                        if(slope==-0.0)slope=0.0;
                        countMap.put(slope, countMap.getOrDefault(slope, 0) + 1);
                    }
                }
                int ans = Integer.MIN_VALUE;
                for(Map.Entry<Double,Integer> values : countMap.entrySet()){
                    if(values.getValue()>ans){
                        ans = values.getValue();
                    }
                }
               count = Math.max(ans,count);
            }


        System.out.println("ans is "+(count+1));
    }
}
