//! Permutations
// Find and print all permutations of  a String
//"abc"
// abc , acb, bac , bca , cab , cba
//? if the string lenght in n then total no of permutation is "n!"
public class Permutations {

    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion - O(n * n!)

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(Newstr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutation(str, "");
    }
}
