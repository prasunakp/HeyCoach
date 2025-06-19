import java.util.Collections;
import java.util.Set;

public class UniquePermutations {

    public static void main(String[] args){
        String s = "abc";
        StringBuilder sb = new StringBuilder(s);
        Set<String> partial_answer = null;
        perm(sb,partial_answer,0);


    }

    private static void perm(StringBuilder s, Set<String> partialAnswer, int idx) {
        if(idx>=s.length()){
            partialAnswer.add(s.toString());
        }
        String s1 = "abc";
        char[] charArray = s1.toCharArray();
        for(int i = idx;i<s.length();i++){
         swap(s,s.charAt(i),s.charAt(idx));
        }
    }

   public static void swap(StringBuilder s , char a, char b){

    }
}
