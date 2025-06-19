package setsjava;

import java.util.ArrayList;
import java.util.TreeSet;

public class GreaterElementOnright {

    public static void main(String[] args){
        int[] arr = { 8,  58, 71, 18, 31, 32, 63, 92, 43, 3,  91, 93, 25, 80, 28 };
        TreeSet<Integer> s = new TreeSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            s.add(arr[i]);
            Integer it = s.higher(arr[i]);
            if (it == null)
                arr[i] = -1;
            else
                arr[i] = it;
        }
        for (int i : arr)
            ans.add(i);
        System.out.println();
    }
    }

