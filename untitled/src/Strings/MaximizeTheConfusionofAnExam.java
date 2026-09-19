package Strings;

public class MaximizeTheConfusionofAnExam {

    public static void main(String[] args){
        String answerKey= "TFFT";
        int k=1;
        int i =0,j=0;
        int countF = 0,countT = 0,ans=0;
        while (j<answerKey.length()){
            if(answerKey.charAt(j)=='T'){
                countT++;
            }
            else {
                countF++;}
            while(Math.min(countF,countT)>k){
               if( answerKey.charAt(i)== 'F') countF--;
               else countT--;
               i++;
            }
            ans = Math.max(ans,countT+countF);
            j++;
        }
System.out.println("cnt "+ans);
    }
}
