package ArraysLC;

import java.util.Arrays;

public class MinimumNumberofMovestoSeatEveryone {
    public static void main(String[] args){

        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int minimumMoves = 0;
        Arrays.sort(students);
        Arrays.sort(seats);
        int[] ans= new int[seats.length];
        for(int i=0;i<seats.length;i++){
        minimumMoves+=Math.abs(seats[i]-students[i]);
        }
System.out.println("moves "+minimumMoves);
    }
}
