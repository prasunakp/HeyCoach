package ArraysLC;

public class MatrixBlockSum {
    static int m=3;
    static int n=3;
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        m= matrix.length;
        n=matrix[0].length;
        int[][] answers = new int[m][n] ;
        int k = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               answers[i][j] = calculateSubMatrix(i,j,k,matrix);
            }
        }
    }

    public static int calculateSubMatrix(int i, int j, int k,int[][] matrix) {
        int row = Math.max(0,i-k);
        int col = Math.max(0,j-k);
        int rowEnd = Math.min(m-1,i+k);
        int colEnd = Math.min(n-1,j+k);
        int sum =0;
       for(int a =row;a<=rowEnd;a++){
           for(int b=col;b<=colEnd;b++){
               sum+=matrix[a][b];
           }
       }
       System.out.println("sum "+sum);
        return sum;

    }


}
