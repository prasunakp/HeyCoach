package Strings;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args){
        String s= "book";
        String vowels ="aeiouAEIOU";
        int cntFirstHalf=0;
        int cntSecondHal=0;
        boolean isValid=false;
        for(int i=0;i<s.length();i++){

            if(vowels.contains(s.charAt(i)+"")){
                if(i>=s.length()/2)
                    cntSecondHal++;
               else
                    cntFirstHalf++;
            }

        }
        isValid = cntSecondHal==cntFirstHalf?true:false;
        System.out.println("valis "+isValid);
    }
}
