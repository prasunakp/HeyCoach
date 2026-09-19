package math;

public class FindGreatestCommonDivisorofArray {
    public static void main(String[] args){
        int[] nums={7,5,6,8,3};
        int smallest=Integer.MAX_VALUE;
        int largest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest)
                smallest=nums[i];
            if(nums[i]>largest)
                largest=nums[i];
        }
        int gcd=1;
        for(int i=1;i<=smallest;i++){
           if(smallest%i==0 && largest%i==0)
               gcd=i;
        }
        System.out.println("ans is "+gcd);
    }
}
