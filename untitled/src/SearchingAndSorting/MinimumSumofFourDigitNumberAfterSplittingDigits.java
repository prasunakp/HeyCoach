package SearchingAndSorting;

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args){
        int num = 4009;
        int[] digits = Integer.toString(num).chars().map(c->c-'0').toArray();
        Arrays.sort(digits);
        int sum1 = Integer.valueOf(String.valueOf(digits[0])+String.valueOf(digits[2])) + Integer.valueOf(String.valueOf(digits[1])+String.valueOf(digits[3]));
        System.out.println("ans "+sum1);
    }
}
