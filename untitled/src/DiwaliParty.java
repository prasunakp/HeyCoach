public class DiwaliParty {

    public static void main(String[] args){
        String s =".*.*..**.*";
        int k = 2;
        int maxlength = 0;
        char[] chars = s.toCharArray();
        for(int i =0;i<chars.length;i++){
           int j=0;
           int cnt=0;
           while(cnt<=k && (i+j)<chars.length){
               j++;
               if(chars[i+j-1]=='.'){
                  cnt++;
               }

           }
           if((j-1)>maxlength){
               maxlength = j-1;
           }
        }

System.out.println("answer is "+maxlength);
    }
}
