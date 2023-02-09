// Find SUbsets
// Find and print all subsets of a given string
// "abc"
//Output: a, b, c, ab, bc, ac, abc," "

// If the string length is n then the total n.o of subset is "2^n"
public class FindSubset {
    // Time complexity: O(n * 2^n)
    // Space complexity: O(n)
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // Yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);

        // No choice
        findSubsets(str, ans, i + 1);

    }

    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
