//Subarrays -> Continuous part of array
/*
 * Total number of Subarrays in n size array is 
 *  -----  { n(n+1)/2 } -----
 */
public class Print_Sub_Arrays {
    public static void printSubarrays(int numbers[]) {
        int totalSubarrays = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                totalSubarrays++;
            }
        }
        System.out.println("Total subarrays = " + totalSubarrays);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }
}

// Time Complexity: O(n^3)
