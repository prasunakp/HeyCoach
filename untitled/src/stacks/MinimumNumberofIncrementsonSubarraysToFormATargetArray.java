package stacks;
//https://www.youtube.com/watch?v=cfteV1AlWg0
public class MinimumNumberofIncrementsonSubarraysToFormATargetArray {
    // ans is the sum of previous elemenet to current element
    // as those many operations have to be increased to reach to the current element
    public static void main(String[] args){
        int[] target = {3,1,1,2};
        int prev = target[0];
        int ans = target[0];
        for(int i=1;i<target.length;i++){
            if(prev<target[i])
                ans+=target[i]-prev;
            prev=target[i];
        }
        System.out.println("ans is "+ans);
    }
}
