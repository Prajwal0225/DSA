import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class basicArrayList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        /*
         * Operations on ArrayList
         * Add Element - O(1)
         * Get Element - O(1)
         * Remove Element - O(1)
         * Set Element at Index - O(1)
         * Contains Element - O(1)
         */

        // Adding element ---> O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Adding elemnt and perticular index
        list.add(1, 9); // O(n)

        System.out.println(list);

        // Get Operation ---> O(1)
        int element = list.get(2);
        System.out.println(element);

        // Delete ---> O(n)
        list.remove(2);
        System.out.println(list);

        // set
        list.set(2, 10);
        System.out.println(list);

        // contains -> that element present at the ArrayList or not
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // Size Of ArrayList
        System.out.println(list.size());

        // print the arrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

        // printing reverse arraylist
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

        // find max element in an Arraylist
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i)) {
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);

        // swap 2 Number
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(3);
        list2.add(6);

        int idx1 = 1;
        int idx2 = 3;

        System.out.println(list2);
        swap(list2, idx1, idx2);
        System.out.println(list2);

        // Sorting an Aeeaylist
        /*
         * Collections.sort()
         */

        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        
    }
}
