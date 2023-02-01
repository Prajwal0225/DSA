//we can represent and number (n) in 'log n + 1' bits

public class CountSetBits {
    public static int CountsetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        // 15 --> 0 1 1 1 1
        System.out.println(CountsetBits(15));
    }
}
