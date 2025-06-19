import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrefixSuffixAandS {

    public static void main(String[] args){
int[] arr1 = {4, 2, -3, 1, 6};
        List<Integer> arr = new ArrayList<>() ;
        arr.add(4);
        arr.add(2);
        arr.add(-3);
        arr.add(1);
        arr.add(6);
       List<Integer> prefixSum = new ArrayList<>(arr);
        List<Integer> suffixSum = new ArrayList<>(arr);
        List<Integer> sums = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
          int  ps = (i==0)?arr.get(i):prefixSum.get(i-1)+arr.get(i);
            prefixSum.set(i,ps);
            int ss = (i==0)? arr.get(arr.size()-1):suffixSum.get(arr.size()-i)+arr.get(arr.size()-i-1);
            suffixSum.set(arr.size()-i-1,ss);
            System.out.println(prefixSum.get(i));
            System.out.println(suffixSum.get(i));
        }
for(int i =0;i<arr.size();i++){
    if(prefixSum.get(i)-suffixSum.get(i) == 0){
        sums.add(i);
    }
}
    }
}
