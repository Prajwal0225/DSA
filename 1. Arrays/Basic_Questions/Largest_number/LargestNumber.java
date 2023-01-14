import java.util.*;

public class LargestNumber {
    public static void getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number form an given array is : " + smallest);
        System.out.println("Largest number form an given array is : " + largest);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        getLargest(numbers);
    }
}

// Time Coplexity : O(n);