import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindXorConnects {

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        HashMap<Integer,Integer> ab = new HashMap<>();
        for(int a1 : a){

            ab.put(a1,1);
        }
        for(int a2:b){
            if(ab.get(a2)==null){
                ab.put(a2,1);}
            else{
                ab.put(a2,ab.get(a2)+1);
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer,Integer> entry : ab.entrySet())
        {
            if(entry.getValue()>1){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
