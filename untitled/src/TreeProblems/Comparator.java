package TreeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparator {

    public static void main(String[] args){
    List<String> values = new ArrayList<>();
        List<String> sortedValues = new ArrayList<>();
        values.add("34");
        values.add("2");
        values.add("10");
        values.add("5");
        values.add("9");
StringBuffer s = new StringBuffer();
        for(int i = 0;i<values.size();i++){
            for(int j=i+1;j<values.size();j++){
           //   int res =(values.get(i)+values.get(j)).compareTo(values.get(j)+values.get(i));
             // System.out.println("res val "+res);
                String a = values.get(i)+values.get(j);
                String b = values.get(j)+values.get(i);
                int res = b.compareTo(a);

              if(res>0){
               String temp = values.get(i);
               values.set(i, values.get(j));
               values.set(j,temp);

              }
            }
        }
        System.out.println("ans "+ Arrays.asList(values));

       /* String ch1  = "34";
        String ch2 = "31";

        String a = ch1+ch2;
        String b = ch2+ch1;

        int c = a.compareTo(b);
        if(c>0){

        }
        System.out.println("answr is "+c);*/
    }
}
