package Strings;

public class AddBinary {
    public static void main(String[] args){
        String a = "11";
        String b="1";
        String ans="";
        String minlength = a.length()>b.length()?b:a;
        String maxLength = a.length()>b.length()?a:b;
        int diff = maxLength.length()-minlength.length();
        int carry = 0;
        for(int i=minlength.length()-1;i>=0;i--){
            int sum = (Integer.valueOf(minlength.charAt(i)+"")+Integer.valueOf(maxLength.charAt(i+diff)+"")+carry)%2;
            carry = (Integer.valueOf(minlength.charAt(i)+"")+Integer.valueOf(maxLength.charAt(i+diff)+"")+carry)/2;
            ans+=sum;
        }

        for(int i=diff-1;i>=0;i--){
            int sum = (Integer.valueOf(maxLength.charAt(i)+"")+carry)%2;
            carry = (Integer.valueOf(maxLength.charAt(i)+"")+carry)/2;
            ans+=sum;
        }
        if(carry>0){
            ans+=carry;
        }
        System.out.println("ans "+new StringBuffer(ans).reverse());
    }
}
