package math;

import java.util.ArrayList;
import java.util.List;

public class SimplifiedFractions {
    public static void  main(String[] args){
        int n=3;
        List<String> ans = new ArrayList<>();
        for(int i=1 ;i<n;i++){
            for(int j=2;j<=n;j++){
             if( getGCD(i,j)<=1 && i<j)
                 ans.add(""+i+""+"/"+j);
            }
        }
    }

    public static int getGCD(int i,int j) {
        int min = i > j ? j : i;
        int gcd =1;
        for(int x=1;x<=min;x++){
            if(i%x==0 && j%x==0 ){
                gcd=x;
            }
        }
        return gcd;
    }
}
