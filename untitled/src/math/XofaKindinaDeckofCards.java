package math;

import java.util.Collections;
import java.util.HashMap;

public class XofaKindinaDeckofCards {
    public static void main(String[] args){
        int[] deck = {0,0,0,1,1,1,2,2,2};
        boolean isValid =true;
        HashMap<Integer,Integer> decKeys = new HashMap<>();
        for(int d:deck){
          decKeys.put(d,decKeys.getOrDefault(d,0)+1);
        }
        int mincnt = Collections.min(decKeys.values());
        int gcd = 1;
        for(int i=2;i<=mincnt;i++){
            boolean isDivisible = true;
         for(int value : decKeys.values()){
             if(value%i>0){
                 isDivisible = false;
                  break;
             }
         }
         if(isDivisible){
             gcd=i;
         }
        }
        isValid = gcd>1?true:false;
       // isValid=decKeys.values().stream().allMatch(x->(x%mincnt==0));
        System.out.println("ans "+isValid);
    }
}
