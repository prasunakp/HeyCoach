package math;

public class AddDigits {
    public static void main(String[] args){
        int num = 38;
        String numString = String.valueOf(num);
       int ans =  calculateSumone( numString);
       System.out.println("ans is "+ans);
    }

    private static int calculateSumone(String numString) {
        if(numString.length()==1){
            return Integer.valueOf(numString);
        }
        int currSum =0;
        for(char ch : numString.toCharArray()){
            currSum+=Integer.valueOf(ch+"");
        }
        return calculateSumone(String.valueOf(currSum));

    }
}
