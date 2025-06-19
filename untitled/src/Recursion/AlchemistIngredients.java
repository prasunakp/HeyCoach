package Recursion;

public class AlchemistIngredients {

    public static void main(String[] args){

int ans = 0;
int perdayIngred = 9;
int noOfDays = 8;
ans = totalIngredients(9,ans,8);
System.out.print("answer is "+ans);
    }

  static int totalIngredients(int perdayIngred,int ans, int noOfDays){
        if(noOfDays==0)
    return ans;
    else
      return totalIngredients(perdayIngred,ans+perdayIngred,noOfDays-1);

    }
}
