package ArraysLC;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args){
    String allowed = "ab";
    String[] words = {"ad","bd","aaab","baa","badab"};
    int cnt =0;
    for(int i=0;i< words.length;i++){
        char[] arr = words[i].toCharArray();
        boolean containsfullWord = true;
        for(int j=0;j<arr.length;j++){
            if(!allowed.contains(arr[j]+"")){
                containsfullWord = false;
              break;
            }
        }
        if(containsfullWord){
            cnt++;
        }
    }
    System.out.println("ans "+cnt);
    }
}
