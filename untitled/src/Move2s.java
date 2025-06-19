import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move2s {
public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(3);
    nums.add(5);
    nums.add(6);
    int cnt = 0;
    long size = nums.stream().filter(x->(x==2)).count();
   for(int i =0;i<nums.size();i++){
       if(nums.get(i)!=2){
           nums.set(cnt,nums.get(i));
           cnt++;
       }
   }
   for(int i =nums.size()-(int) size; i<nums.size();i++){
       nums.set(i,2);
   }
    //nums.add(6);

  //  int cnt = 0;

    for(int a : nums){
        System.out.print(a+" ");
    }
}
}
