package HashMaps;

public class SubArraysWithSum {
    public static void main(String[] args){
        int[] arr = {-1, 32, 3980, -8 ,39 ,40, 31, -31 ,31, 11};
        int count  = 0;
        int sum = 31;
        for(int i =0;i<arr.length;i++){
            int expectedSum = 0;
for(int j = i; j<arr.length;j++){
    expectedSum += arr[j];
    if(expectedSum == sum){
        count++;
      //  break;
    }
}
        }
        System.out.println("sum is "+count);
    }
}
