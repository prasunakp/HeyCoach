package ArraysLC;

import java.text.DecimalFormat;
import java.util.HashMap;

public class UniqueMorseCodeWords {
    public static void main(String[] args){
        double d= 21110.123;
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(d);
        String s = df.format(d).toString();
       String s1 = String.format("%.2f",d);
        System.out.println("answer "+s1);

    }
}
