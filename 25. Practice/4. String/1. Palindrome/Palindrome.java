//check wheather the given string is a palindrome

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "al";
        System.out.println(isPalindrome(str));
    }
}
