package math;
//formula is max(dx,dy)
public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args){
int[][] points = {{3,2},{-2,2}};
int time=0;
for(int i=0;i<points.length-1;i++){
time+=Math.max(Math.abs(points[i+1][0]-points[i][0]),Math.abs(points[i+1][1]-points[i][1]));
}
System.out.println("ans is "+time);
    }
}
