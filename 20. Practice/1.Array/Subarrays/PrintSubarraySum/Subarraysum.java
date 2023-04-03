
public class Subarraysum{
    //brute force Subarraysum
    //O(n^3)
    public static int brute_Subarraysum(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i ;k<=j;k++){
                    sum += arr[k];
                }
                max = Math.max(sum,max);
                sum = 0;
            }
        }
        return max;
    }

    //prefix sum
    //O(n^2)
    public static int prefix_maxSubarraysSum(int numbers[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        for(int i = 1;i<numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                curr = start == 0 ? prefix[end]:prefix[j] - prefix[i-1];
                if(curr > max){
                    max = curr;
                }
            }
        }

        return max;
    }


    //kadan's Algorithm
    //O(n)
    public static int Kadans_maxSubarraysSum(int numbers[]){
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<numbers.length;i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            max = Math.max(max,cs);
        }
        return max;
    }




    public static void main(String args[]){
        int arr[] = {-4,6,7,4,9};
        System.out.println(brute_Subarraysum(arr));

        int numbers[] = { 1, -2, 6, -1, 3 };
        int maxii = prefix_maxSubarraysSum(numbers);
        System.out.println("The maximum sum of the subarray is : " + maxii);

        System.out.println(Kadans_maxSubarraysSum(numbers));
    }
}