import java.util.*;

public class Linked_Hash_Map {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 150);

        System.out.println(lhm);
    }
}
