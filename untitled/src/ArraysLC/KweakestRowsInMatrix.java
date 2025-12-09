package ArraysLC;

import java.util.Arrays;

public class KweakestRowsInMatrix {
    public static void main(String[] args){
int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
int[] ans = new int[mat.length];
int[] finalAns = new int[mat.length];
        Arrays.fill(ans,mat[mat.length-1].length);
for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[i].length;j++){
        if(mat[i][j]==0){
            ans[i] = j;
            break;
        }
    }
}
for(int i=0;i<ans.length;i++)
    System.out.println(" "+ans[i]);

for (int i=0;i< ans.length;i++){
    for(int j=i;j<ans.length;j++){
if(ans[i]>ans[j]){

}
    }
}

    }


}
