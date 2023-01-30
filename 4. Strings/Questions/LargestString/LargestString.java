import javax.swing.LayoutStyle;

//lexicographically largest string

//str1.compareTo(str2)
//0 : string are equal
//-ve : str1 < str2
//+ve : str1 > str2

//comparetoIgnorCase  ---> treat uppercase and lowercase same
public class LargestString {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
