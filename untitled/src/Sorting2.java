import java.util.ArrayList;
import java.util.List;

public class Sorting2 {
    public static void main(String[] args){
        List<String> inventory1 = List.of("book", "enchanted", "spell", "wand");
        List<String> inventory2 = List.of("ancient", "dragon", "magic", "scroll");
        List<String> inventpry3 = new ArrayList<>();

        for(String invent : inventory1){
            inventpry3.add(invent);
        }

        for(String invent : inventory2){
            inventpry3.add(invent);
        }
        for(int i = 0; i<inventpry3.size();i++) {
            for (int j = i + 1; j < inventpry3.size(); j++) {
                if (inventpry3.get(j).compareTo(inventpry3.get(i)) < 0) {
                    String temp = inventpry3.get(j);
                    inventpry3.set(j, inventpry3.get(i));
                    inventpry3.set(i, temp);

                    // inventory1.get(i-1) =  temp;
                }
            }
        }

        inventpry3.stream().forEach(x->System.out.println(x));

    }
}
