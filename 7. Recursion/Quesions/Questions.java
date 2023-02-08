import javax.swing.text.html.HTMLDocument.RunElement;

public class Questions {
    // sum of n natural number
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // print Nth fibonacci number
    // Time Complexity : O(2^n)
    // Space Complexity : O(n)
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        return fnm1 + fnm2;
    }

    // Given array is sorted or not
    // Time complexity: O(n)
    // Space Complexity: O(n)
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    // find the first occurence of an element in an array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int fistOccr(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return fistOccr(arr, key, i + 1);
    }

    // find the last occurence of an element in an array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int lastOccr(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccr(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // print X^n
    // Time Complexity: O(n)
    // Space Complexity: O()
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    // Time Complexity: O(log n)
    public static int optimizedpower(int a, int n) {
        if (n == 0) {
            return -1;
        }
        int halfpower = optimizedpower(a, n / 2);
        int halfPowerSq = halfpower * halfpower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        System.out.println(sum(5));

        System.out.println(fib(25));
        System.out.println(fib(26));
        System.out.println(fib(27));
        System.out.println(fib(28));

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isSorted(arr, 0));

        int arr1[] = { 1, 2, 77, 4, 5, 6, 5, 3 };
        System.out.println(fistOccr(arr1, 5, 0));

        System.out.println(lastOccr(arr1, 5, 0));

        System.out.println(power(2, 10));

        System.out.println(optimizedpower(2, 10));
    }
}
