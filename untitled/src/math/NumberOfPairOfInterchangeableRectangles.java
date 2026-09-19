package math;

import java.util.HashMap;

public class NumberOfPairOfInterchangeableRectangles {
    public static void main(String[] args){
        int[][] rec = {{32768,65536},{32768,65536},{32768,65536},{32768,65536}};
        long cnt =0;
        HashMap<String,Integer> values = new HashMap<>();
        for(int i=0;i<rec.length;i++){
            int min = rec[i][0]>rec[i][1]?rec[i][1]:rec[i][0];
            int gcd=0;
            for(int j=1;j<=min;j++){
              if(rec[i][1]%j==0 && rec[i][0]%j==0)
                  gcd=j;
            }
            int q = rec[i][1]%gcd;
            int k = rec[i][0]%gcd;
             values.put(""+k+"/"+q,values.getOrDefault(""+k+"/"+q,0)+1);
        }
      for(Integer val : values.values()) {
          cnt += val * (val - 1) / 2;
      }
      System.out.println("ans "+cnt);
    }
}
