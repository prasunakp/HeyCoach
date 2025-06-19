package BackTracking;

public class WordCorrection {

    public static void main(String[] args){
        String s = "ViP";
        String ans =s;
        StringBuffer s1 = new StringBuffer(s);
        int upper =0;
        int lower = 0;
        for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch >= 'A' && ch <= 'Z')
                    upper++;
                if(ch >= 'a' && ch <= 'z')
                    lower++;
            }
if(upper == lower)
   ans = s.toString().toLowerCase();
if(upper>lower){
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
     ans=   s.replace(s.charAt(i)+"",s.charAt(i)+"".toUpperCase());
    }
}
        if(lower>upper){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
             ans=       s.toString().replace(s.charAt(i)+"",s.charAt(i)+"".toLowerCase() );
            }
        }
        System.out.print("answer "+ans);
    }
}
