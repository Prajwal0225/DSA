//Array must be sorted

public class BinarySearch {
    public static int Binary_search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) { // found
                return mid;
            } else if (numbers[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        System.out.println("Index for given key is : " + Binary_search(numbers, key));
    }
}

// Time Complexity: O(log n);