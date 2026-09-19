package stacks;

import java.util.Stack;

public class FinalPricesWithSpecialDiscount {

    public static void main(String[] args){
        int[] prices = {10,1,1,6};

        int[] finalAns = prices;

        for(int i=0;i<prices.length;i++){
              for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    finalAns[i] = prices[i]-prices[j];
                    break;
                }
              }
        }
    }
}
