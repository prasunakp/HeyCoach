package ArraysLC;

public class CountNumberofPairsWithAbsoluteDifferenceK {
    public static void main(String[] args){
    int[] arr = {1,2,2,1};
    int k=1;
    int ans =0;
    for(int i=0;i< arr.length;i++){
        for(int j =i+1;j< arr.length;j++){
          if(Math.abs(arr[i]-arr[j])==k)
            ans++;
        }
      }
    }
}
