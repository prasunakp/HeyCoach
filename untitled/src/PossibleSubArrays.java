public class PossibleSubArrays {

    public static void main(String[] args){
int sizeOfArray =0;
int t=15;
int days = 1;
int finalans = 0;
        int[] whether = {3,1,15};
        for(int i =0;i<whether.length;i++){
            if(whether[i]>t){
                continue;
            }
         //   System.out.print(whether[i]+" ");
            finalans +=   printSubArray(sizeOfArray,i,whether,t, days);


        }
        System.out.println("answer is"+finalans);
    }

    private static int printSubArray(int sizeOfArray, int i,int[] whether,int t, int days) {
        int ans = 0;
        for(int j=i+days-1;j<whether.length;j++){
            int cnt = 0;
            for(int k = i; k<=j ;k++){
                if(whether[k]<=t) {
                    cnt++;
                   // System.out.print(whether[k] + " ");
                }
            }
            if(cnt == (j+1-i)){
                ans++;
            }
          //  System.out.println(" ");
        }
        return ans;
    }
}
