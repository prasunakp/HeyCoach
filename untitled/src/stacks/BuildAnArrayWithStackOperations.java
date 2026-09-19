package stacks;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static void main(String[] args){
       int[] target = {1,2,3};

       int n =3;
       List<String> ans = new ArrayList<>();
       int incOperator =0;
       for(int i=1;i<=target[target.length-1];i++){
                if(target[incOperator]==i){
                        ans.add("Push");
                        incOperator++;
                }
                else{
                    ans.add("Push");
                    ans.add("Pop");
                }
         }
       for(String eachAns : ans){
           System.out.println(eachAns);
       }

    }

}
