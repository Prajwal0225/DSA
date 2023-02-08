public class print_number {
    // Print no in decreasing order
    public static void printDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // print no in increasing order
    public static void printInc(int n) {
        if (n == 0) {
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        printDec(10);
        System.out.println();
        printInc(10);
    }
}
