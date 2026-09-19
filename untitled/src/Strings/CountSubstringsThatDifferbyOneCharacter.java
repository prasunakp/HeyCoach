package Strings;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=CGokZpAxzLY
public class CountSubstringsThatDifferbyOneCharacter {
    public static void main(String[] args){
       String s = "aba";
       String t = "baba";
        List<String> strings= new ArrayList<>();
        getSubset(s,strings);

        List<String> tstring = new ArrayList<>();
        getSubset(t,tstring);

       for(String sValue : strings){
           System.out.println("value is "+sValue);
       }

        for(String sValue : tstring){
            System.out.println("value is "+sValue);
        }

        for(String singString : strings){
            int diff=0;
            for(String singletstring : tstring){

            }
        }

    }

    public static List<String> getSubset(String s,List<String> strings){
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                strings.add(s.substring(j,i+j));
            }
        }
        return strings;
    }
}
