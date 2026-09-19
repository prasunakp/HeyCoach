package DivideAndConquer;

public class ReverseBits {
    public static void main(String[] args){
        int ans =0;
        int mask=1;
        int n=43261596;
        for(int i=0;i<32;i++){
            if((mask&n)!=0){
                ans+=1<<31-i;//didnt undestand why we are doing an addition rto oprevious value will check in bit manipulation
            }
            mask<<=1;
        }
System.out.println("ans is "+ans);
    }
}
