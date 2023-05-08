import java.util.*;
import java.util.HashMap;

public class Basic {
    public static void main(String args[]) {
        // create HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // // Insert -O(1)
        // hm.put("India", 100);
        // hm.put("China", 110);
        // hm.put("US", 50);

        // System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));

        // // containsKey - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        // // remove-O(1)
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // // Size
        // System.out.println(hm.size());

        // // IsEmpty
        // System.out.println(hm.isEmpty());

        // // clear
        // hm.clear();

        // System.out.println(hm.isEmpty());

        // Iteration on HashMaps

        // Insert -O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }

    }
}
