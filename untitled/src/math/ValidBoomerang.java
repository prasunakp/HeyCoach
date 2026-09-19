package math;

public class ValidBoomerang {
    public static void main(String[] args){

        int[][] p = {{0,0},{1,2},{0,1}};
        double area = Math.abs(p[0][0]*(p[1][1]-p[2][1])+p[1][0]*(p[2][1]-p[0][1])+p[2][0]*(p[0][1]-p[1][1]));
         area = area/2;
         System.out.println("ans is "+area);
    }
}
