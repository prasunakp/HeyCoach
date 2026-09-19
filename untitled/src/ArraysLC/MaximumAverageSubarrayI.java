package ArraysLC;

public class MaximumAverageSubarrayI {
    public static void main(String[] args){
        int[] arr = {0,1,1,3,3};
        int k=4;
        int iniSum = 0;
        Double ans = 0.0;
        for(int i=0;i<k;i++){
             iniSum+=arr[i];
        }
        ans = (double)iniSum/k;
        for(int i=1;i< arr.length-k;i++){
            iniSum = iniSum-arr[i-1]+arr[i+k-1];
            if(((double)iniSum/k)>ans){
                ans = (double)iniSum/k;
            }
        }
        System.out.println("ans is "+ans);
    }
}
