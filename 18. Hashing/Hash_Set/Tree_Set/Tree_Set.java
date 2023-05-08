import java.util.*;

public class Tree_Set {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Gadchiroli");
        cities.add("Aurangabad");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Gadchiroli");
        lhs.add("Aurangabad");

        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Gadchiroli");
        ts.add("Aurangabad");

        System.out.println(ts);
    }
}
