package math;

public class DivisorGame {
    public static void main(String[] args){
        int n=3;
        int x=1;
    boolean isAlice = calculateWin(n,x,true);
    System.out.println("iaLIce won "+!isAlice);
    }
    public static boolean calculateWin(int n , int x , boolean isAlice){
        if((n - x) > 0 && n%x==0) {
          return  calculateWin(n - x, 1, !isAlice);
        }
        if(x+1<n)
          return  calculateWin(n,x+1,isAlice);
       return isAlice;
    }
}
