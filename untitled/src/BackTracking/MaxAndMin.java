package BackTracking;

public class MaxAndMin {
public static void main(String[] args) {
    int[] arr = {3, 2, 10, 4, 7, 8};

    int max = 0;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length;i++){
        if(arr[i]>max)
            max = arr[i];
        if(arr[i]<min)
            min=arr[i];

    }
    System.out.println("answer is "+(max-min));
}
}
