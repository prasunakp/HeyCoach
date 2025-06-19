package BackTracking;

public class OnlyKStrings {

    public static void main(String[] args){
        String s = "Hello how are you Contestant";
        int k =4;
        String[] strArray = s.split(" ");
        String ans = "";
  for(int i =0;i<k;i++){
      ans += strArray[i]+" ";
  }
  System.out.println("answe is "+ans.trim());
    }
}
