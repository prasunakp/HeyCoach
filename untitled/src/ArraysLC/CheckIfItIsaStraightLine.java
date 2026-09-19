package ArraysLC;

public class CheckIfItIsaStraightLine {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        Integer slope = null;
        boolean isStraightLine = true;
        int dx = arr[1][0] - arr[0][0];
        int dy = arr[1][1] - arr[0][1];
        for (int i = 1; i < (arr.length - 1); i++) {
            for(int j=0;j<(arr[0].length-1);j++) {
                if ((arr[i + 1][j] - arr[i][j]) * dy != (arr[i + 1][j+1] - arr[i][j+1]) * dx) {
                    isStraightLine = false;
                    break;
                }
            }
        }
        System.out.println("ans "+isStraightLine);
    }
}