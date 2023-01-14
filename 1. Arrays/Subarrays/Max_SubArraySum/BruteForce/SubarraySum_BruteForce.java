public class SubarraySum_BruteForce {
    public static int maxSubarraysSum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    // subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        int maxii = maxSubarraysSum(numbers);
        System.out.println("The maximum sum of the subarray is : " + maxii);
    }
}

// Time Complexity: O(n^3);
