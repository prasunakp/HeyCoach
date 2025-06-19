import java.util.ArrayList;
import java.util.List;

public class NegetiveElementWithinK {

    public static void main(String[] args){

       int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
       int k =3;
       List<Integer> negivenum = new ArrayList<>();
       for(int i =0;i<=(arr.length-k) ;i++){
           int j =0;
           while(j<k){
               if(arr[i+j]<0){
                   negivenum.add(arr[i+j]);
                   break;
               }
               else if (j==(k-1)){
                   negivenum.add(0);
               }
               j++;
           }
       }
    negivenum.stream().forEach(x->System.out.print(x+" "));

    }
}
