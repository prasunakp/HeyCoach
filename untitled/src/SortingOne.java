import java.util.Arrays;

public class SortingOne {

    public  static  void main (String[] args){
        char[] balls = {'S', 'G' ,'W', 'G',  'S'};
        char[] colors = {'S','W','G'};
        int cnt = 0;
        for(char color : colors){
            for(int i =0;i<balls.length;i++){
                if(balls[i] == color){
                    char temp = balls[cnt];
                    balls[cnt] = color;
                    balls[i] = temp;
                    cnt++;
                }
            }

        }
        System.out.println(Arrays.toString(balls));

    }
}
