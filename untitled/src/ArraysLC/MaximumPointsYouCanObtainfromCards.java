package ArraysLC;

public class MaximumPointsYouCanObtainfromCards {

    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,6,1};
        int k=3;
        int lsum=0;
        for(int i=0;i<k;i++){
          lsum+=arr[i];
        }
        int maxSum=lsum;
        int rindex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lsum = lsum -arr[i] + arr[rindex];
            rindex=rindex-1;
            if(lsum>maxSum){
                maxSum=lsum;
            }
        }
        System.out.println("ans is "+maxSum);
    }
}
