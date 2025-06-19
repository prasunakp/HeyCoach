public class SampletestClass {

    public static void main (String[] args){
        int n= 1963468;
        int l=0;
        int r= n;
        int  mid = 0;
        while(l<=r)
        {
          mid = (l+r)/2;
            if(mid*mid <= n && ((mid+1)*(mid+1)>n)){
               break;
            }
            if(mid*mid <n){
                l = mid +1;
            }
            else{
                r=mid-1;
            }
        }

        System.out.println("value is "+mid);
    }
}
