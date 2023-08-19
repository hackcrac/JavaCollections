import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Vishnu", 1);
        mp.put("Narayana", 2);
        mp.put("Rama", 3);
        mp.put("Krishna",4);
        System.out.println(mp.getOrDefault("Kalki",0));
        System.out.println(mp.get("Krishna"));
        // 1st way to traverse the map
        Set<Map.Entry<String, Integer>> entry1 = mp.entrySet();
        for(Map.Entry<String, Integer> it: entry1){
            System.out.println(it.getKey()+", "+it.getValue());
        }
        System.out.println();
        // 2nd way to traverse the map
        Set<String> entry2 = mp.keySet();
        for(String it : entry2){
            System.out.println(it+", "+mp.get(it));
        }
    }
}
