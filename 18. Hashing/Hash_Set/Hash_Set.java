import java.util.*;

public class Hash_Set {
    public static void main(String args[]) {
        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);

        // System.out.println(set);

        // if (set.contains(2)) {
        // System.out.println("set contains 2");
        // } else {
        // System.out.println("set does not contains");
        // }

        // set.remove(2);
        // if (set.contains(2)) {
        // System.out.println("set contains 2");
        // } else {
        // System.out.println("set does not contains");
        // }

        // System.out.println(set.size());

        // set.clear();

        // System.out.println(set.size());

        // System.out.println(set.isEmpty());


        //Iterating over HashSet
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Gadchiroli");
        cities.add("Aurangabad");

        //Using Iterator
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Using for loop
        for(String city:cities){
            System.out.println(city);
        }



    }
}
