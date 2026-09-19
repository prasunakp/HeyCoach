package stacks;

public class TrappingRainWater {
    //logic
    // minimum of left max and right max  minus height will give us the actuall amount of water it can hold;
    public static void main(String[] args){
        int[] height = {4,2,0,3,2,5};
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int lm =0;
        int rm=0;
        int sum =0;
        for(int i=0;i<height.length;i++){
            lmax[i] = lm;
            rmax[height.length-1-i]=rm;
             if(lm<height[i]) {
                 lm = height[i];
             }
             if(rm<height[height.length-1-i]){
                 rm=height[height.length-1-i];
             }
        }
for(int i=0;i<height.length;i++){
    int minVal = Math.min(lmax[i],rmax[i]);
   sum+= minVal-height[i]>0?minVal-height[i]:0;
}
      System.out.println("sum is "+sum);
    }
}
