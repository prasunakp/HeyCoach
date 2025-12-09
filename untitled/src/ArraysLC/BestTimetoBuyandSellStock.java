package ArraysLC;

import java.util.ArrayList;
import java.util.List;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args){
         int[] prices = {2,1,2,1,0,1,2};
         int min = Integer.MAX_VALUE;
         int index=0;
        /* for(int i=0;i<prices.length;i++){
                if(prices[i]<min){
                        min = prices[i];
                        index=i;
                }
         }
         min=0;
         for(int j=index;j<prices.length;j++){
               if(prices[j]>min){
                   min=prices[j];
               }
         }*/
        int buyPrice = 0;
        int currentProfit =0;
        int maxProfit =0;
 for(int i=0;i<prices.length;i++){
if(i==0 || prices[i]<buyPrice){
    buyPrice=prices[i];
}
currentProfit=prices[i]-buyPrice;
if(currentProfit>maxProfit)
    maxProfit=currentProfit;
 }
 System.out.println("current profit "+maxProfit);
    }
}
