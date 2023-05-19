//convert first character of every word to uppercase
public class Uppercase {
    public static StringBuilder toUppercase(String str) {
        StringBuilder S = new StringBuilder("");
        S.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                S.append(str.charAt(i));
                i++;
                S.append(Character.toUpperCase(str.charAt(i)));
            } else {
                S.append(str.charAt(i));
            }

        }
        return S;
    }

    public static void main(String args[]) {
        String str = "hello world";
        System.out.println(toUppercase(str));
    }
}
