import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PreFiXSum {

    public static void main(String[] args){
        int[] arr = {1,4,-2,-2,5,-4,3};
        Set<Integer> elements = new HashSet<>();
        int[] prefix= new int[arr.length];
        for(int i =0;i<arr.length;i++){
            prefix[i] = (i>0) ?prefix[i-1] +arr[i] :arr[i];
            if(prefix[i]==0){
                System.out.println("true");
            }
            else if(!elements.contains(prefix[i])){
                elements.add(prefix[i]);
            }
            else{
                System.out.println("true");
            }
        }
System.out.println("false");
    }
}
