/*
    Property
    2^2 - 4  
    4 --> 1 0 0
    3 --> 0 1 1 
    4 & 3  -> 0 


    2^3 - 8
    8 --> 1 0 0 0
    7 --> 0 1 1 1 
    8 & 7  -> 0 

    n & (n-1) = 0 -> power of two else not 
*/

public class Powerof_TwoOrNot {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(4));
    }
}
