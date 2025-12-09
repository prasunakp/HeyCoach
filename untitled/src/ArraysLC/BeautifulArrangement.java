package ArraysLC;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArrangement {
    public static void main(String[] args){
        int number=12;
        int[] n = new int[number];
        for(int i=0;i<n.length;i++){
            n[i]=i+1;
        }
      int  index=0;
        List<List<Integer>> ansList = new ArrayList<>();
        ansList = getpermutations(n,index,ansList);
        System.out.println(ansList.size());
        
    }

   public static List<List<Integer>> getpermutations(int[] n, int index, List<List<Integer>> ansList) {
        if(index==n.length){
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<n.length;i++){
                if(n[i]%(i+1)==0 || (i+1)%n[i]==0) {
                    ans.add(n[i]);
                }
                else{
                    break;
                }
            }
            if(ans.size()==n.length)
            ansList.add(ans);
            return ansList;
        }
        for (int i=index;i<n.length;i++){
            swap(index,i,n);
            getpermutations(n,index+1,ansList);
            swap(index,i,n);
        }
        return ansList;
    }

    static void swap(int n1 , int n2,int[] n){
        int temp =n[n1];
         n[n1]=n[n2];
         n[n2] = temp;
    }
}
