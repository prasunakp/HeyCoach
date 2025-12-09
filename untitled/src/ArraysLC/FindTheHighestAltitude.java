package ArraysLC;

import java.util.Arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        int[] heights = new int[gain.length+1];
        for(int i=1;i<=gain.length;i++){
            heights[i] = heights[i-1]+gain[i-1];
        }
        int max = Arrays.stream(heights).max().getAsInt();
        System.out.println(max);
    }
}
