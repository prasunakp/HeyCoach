package ArraysLC;

public class RichestCustomerWealth {
public static void main(String[] args){
    int[][] wealth = {{1,5},{7,3},{3,5}};
    int richestWealth = 0;
    for(int i=0;i< wealth.length;i++){
        int currentWealth = 0;
        for(int j=0;j<wealth[0].length;j++){
            currentWealth += wealth[i][j];
            }
        richestWealth = Math.max(richestWealth,currentWealth);
        }
    System.out.println("wealht "+richestWealth);
    }
}
