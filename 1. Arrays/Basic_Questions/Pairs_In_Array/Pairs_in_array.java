public class Pairs_in_array {
    public static void printpair(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printpair(numbers);
    }
}

/*
 * Time Complexity
 * (n-1) + (n-2) + (n-3) + ... + 2 + 1 = n(n-1)/2
 * 
 * Time Complexity = O(n^2)
 */
