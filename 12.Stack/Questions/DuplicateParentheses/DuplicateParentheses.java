import java.util.Stack;

//Time Complexity : O(n)
public class DuplicateParentheses {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                }
            } else {
                // opeing
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String args[]) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
