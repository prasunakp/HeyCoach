package ArraysLC;

public class GetMaximuminGeneratedArray {
    public static void main(String[] args){
        int n=6;
        int[] ans = new int[n+1];
        ans[1]=1;
        int flex=0;
        for(int i=2;i< ans.length;i=i+2){
            flex=i/2;
            ans[i] = ans[flex];
            if((i+1)< ans.length)
            ans[i+1] = ans[flex]+ans[flex+1];
        }
        int max=0;
        for(int i=0;i< ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
    }

}
