//print a substring starting and ending index are given 
//starting index : 3
//ending index : 7

public class Substring {

    public static StringBuilder substring(String str, int si, int ei) {
        StringBuilder S = new StringBuilder("");
        for (int i = si; i < ei; i++) {
            S.append(str.charAt(i));
        }
        return S;
    }

    public static void main(String args[]) {
        String str = "My name is Prajwal";
        System.out.println(substring(str, 3, 7));

        // inbuild substring
        System.out.println(str.substring(11, 18));
    }
}
