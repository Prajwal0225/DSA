//Time complexity: O(n)
//space complexity: O(n)

public class Print_factorial {
    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }

        int fn = n * fac(n - 1);
        return fn;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(fac(n));
    }
}
