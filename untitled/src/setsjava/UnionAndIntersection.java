package setsjava;

import java.util.HashSet;
import java.util.TreeSet;

public class UnionAndIntersection {

    public static void main(String[] args){
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {1, 1, 3, 5, 6, 6};
        HashSet<Integer> unionOne = new HashSet<>();
        HashSet<Integer> unionTwo = new HashSet<>();
TreeSet<Integer> union = new TreeSet<>();
        TreeSet<Integer> intersection = new TreeSet<>();
        for(int i =0;i<arr1.length;i++){
            unionOne.add(arr1[i]);
            union.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            unionTwo.add(arr2[i]);
            union.add(arr2[i]);
        }
        for(Integer s:unionOne) {
            if(unionTwo.contains(s))
                intersection.add(s);
        }
       for(int u : union){
           System.out.print(u+" ");
       }
       System.out.print("\n");
       for(int i : intersection)
        System.out.print(i+" ");
    }
}
