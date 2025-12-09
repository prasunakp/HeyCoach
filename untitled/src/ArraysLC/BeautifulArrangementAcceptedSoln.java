package ArraysLC;

public class BeautifulArrangementAcceptedSoln {
    static int count=0;
    public static void main(String[] args){

        int n=3;
        int num[] = new int[n+1];
        helper(num,1,n);
       System.out.println("count "+count);
    }
    public static void helper(int num[], int val, int n){
        if(val>n){
            count++;
            return;
        }

        for(int i=1;i<=n;i++){
            if(num[i]==0 && (i%val==0 || val%i==0)){
                num[i]=1;
                helper(num,val+1,n);
                num[i]=0;
            }
        }
    }
}
