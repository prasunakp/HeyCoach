package math;

public class NimGame {
    public static void main(String[] args){
        int n=4;
        boolean win = calculateWin(n);
        System.out.println("win "+win);
    }
    public static boolean calculateWin(int n){
        if(n<=3){
            return true;
        }
      return calculateWin(n-1) || calculateWin(n-2) || calculateWin(n-3);
    }
}
