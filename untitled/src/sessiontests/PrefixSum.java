package sessiontests;

public class PrefixSum {

    public static void main(String[] args) {

        String s = "abcabdc";
        String s1="";
        boolean repeat = true;

        while(repeat) {
            char[] arr = s.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (s1 == "")
                    s1 += arr[i];
                else if (s.substring(s1.length(), s.length()).contains(s1))
                    s1 += arr[i];
                else {
                    s = s.substring(s1.length() - 1, s.length());
                    s1 = "";
                    i--;
                    if (i < 0)
                        repeat = false;
                }
            }
        }
        System.out.print("answer is"+s);
    }
}
