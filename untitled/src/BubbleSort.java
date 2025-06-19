import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //int count = StringUtils.countMatches("a.b.c.d", ".");
        int[] arr = {8,4,3,2,1};
    for (int k = arr.length; k>= 1;k--){
        for(int i = 1; i <k; i++){
            if(arr[i-1]>arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }
    }

        System.out.println("array is "+Arrays.toString(arr));

    }

}