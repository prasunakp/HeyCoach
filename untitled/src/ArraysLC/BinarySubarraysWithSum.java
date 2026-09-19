package ArraysLC;

public class BinarySubarraysWithSum {
    public static void main(String[] args){
        int[] arr = {1,0,1,0,1};
        int goal = 2;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int j=0;
            while (sum<=goal && (i+j)<arr.length){
                sum+=arr[i+j];
                if(sum==goal){
                    cnt++;
                }
                j++;
            }
        }
System.out.println("ans is "+cnt);
    }
}
