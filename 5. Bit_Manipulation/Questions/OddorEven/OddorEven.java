// Observe
//1  -> 0 0 0 0 0 0 0 1
//2  -> 0 0 0 0 0 0 1 0
//3  -> 0 0 0 0 0 0 1 1 
//4  -> 0 0 0 0 0 1 0 0
//As we can observer that (LSB) of odd is '1' and even is '0'
//So if we perform the & operator with 1 we get the (LSB)

//Example int n = 3
// 3 -> 0 0 0 0 0 0 1 1
// 1 -> 0 0 0 0 0 0 0 1
// 3 & 1 -> 0 0 0 0 0 0 0 1

public class OddorEven {
    public static void oddOReven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // Even
            System.out.println("Even number");
        } else {
            // Odd
            System.out.println("Odd number");
        }
    }

    public static void main(String args[]) {
        int n = 3;
        oddOReven(n);
    }
}
