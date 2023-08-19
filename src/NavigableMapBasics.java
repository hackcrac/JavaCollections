import java.util.*;

public class NavigableMapBasics {
    public static void main(String[] args) {
        NavigableMap<String, Integer> mp = new TreeMap<>();
        mp.put("Vishnu", 4);
        mp.put("Narayana", 3);
        mp.put("Rama", 2);
        mp.put("Krishna", 1);
        System.out.println(mp.getOrDefault("Kalki", 0));
        System.out.println(mp.get("Krishna"));
        // 1st way to traverse the map
        Set<Map.Entry<String, Integer>> entry1 = mp.entrySet();
        for (Map.Entry<String, Integer> it : entry1) {
            System.out.println(it.getKey() + ", " + it.getValue());
        }
        System.out.println();
        // 2nd way to traverse the map
        Set<String> entry2 = mp.keySet();
        for (String it : entry2) {
            System.out.println(it + ", " + mp.get(it));
        }
        System.out.println();
        System.out.println(mp.firstKey());
        System.out.println(mp.lastKey());
        System.out.println(mp.firstEntry());
        System.out.println(mp.lastEntry());
        System.out.println(mp.floorKey("Shiva"));
        System.out.println(mp.floorEntry("Vishnu"));
        System.out.println(mp.ceilingKey("Shiva"));
        System.out.println(mp.ceilingEntry("Vishnu"));
        System.out.println(mp.lowerKey("Shiva"));
        System.out.println(mp.lowerEntry("Shiva"));
        System.out.println(mp.higherKey("Shiva"));
        System.out.println(mp.higherEntry("Shiva"));
    }
}
