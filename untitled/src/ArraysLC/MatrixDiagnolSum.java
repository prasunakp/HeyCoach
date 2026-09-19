package ArraysLC;

public class MatrixDiagnolSum {
    public static void main(String[] args){
        int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum =0;
        for (int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
        }
        for (int i=0;i<matrix.length;i++){
            sum+=matrix[i][matrix[0].length-i-1];
        }
        if(matrix.length%2!=0){
            sum = sum-matrix[matrix.length/2][matrix.length/2];
        }
        System.out.println("ans is"+sum);
    }
}
