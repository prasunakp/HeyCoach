package Strings;

public class MaximumNumberofVowelsinSubstringofGivenLength {

    public static void main(String[] args){
        String s = "weallloveyou";
        String vowels ="aeiouAEIOU";
int k =7;
        int maxCnt = 0;

        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i)+"")){
                maxCnt++;
            }
        }
        int cnt =maxCnt;
        int j=0;
for(int i=k ;i<s.length();i++){
    if(vowels.contains(s.charAt(j)+"")){
        cnt--;
    }
    if(vowels.contains(s.charAt(i)+"")){
        cnt++;
    }
    if(cnt>maxCnt){
        maxCnt=cnt;
    }
    j++;
}

System.out.println("value is "+maxCnt);
    }
}
