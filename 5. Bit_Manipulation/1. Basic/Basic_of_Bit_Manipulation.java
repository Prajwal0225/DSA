public class Basic_of_Bit_Manipulation {
    public static void main(String args[]) {

        /*
         * & --> Binary And
         * 1 & 1 - 1
         * 1 & 0 - 0
         * 0 & 1 - 0
         * 0 & 0 - 0
         */
        System.out.println(5 & 6);

        /*
         * | --> Binary OR
         * 1 & 1 - 1
         * 1 & 0 - 1
         * 0 & 1 - 1
         * 0 & 0 - 0
         */
        System.out.println(5 | 6);

        /*
         * ^ --> Binary XOR
         * 1 & 1 - 0
         * 1 & 0 - 1
         * 0 & 1 - 1
         * 0 & 0 - 0
         */
        System.out.println(5 ^ 6);

        /*
         * Binary one's Complement ( ~ )
         * ~ 0 - 1
         * ~ 1 - 0
         * 
         * 5 -> 0 0 0 0 0 1 0 1
         * ~5 -> 1 1 1 1 1 0 1 0
         * 
         * Most Siginificant Bit (MSB) --> left most bit
         * Least Siginificant Bit(LSB) --> Right most bit
         * Here most siginificant Bit (MSB) changes and (MSB) defines whether the number
         * is positive or negative.
         * 
         * To find the value of negative number we have 2's complement that is :
         * 
         * 1. 1's complement
         * 2. Add 1 to it
         * 
         * 1. 1's complement of ~5 -> 0 0 0 0 0 1 0 1
         * 
         * 2. Adding 1
         * 
         * 0 0 0 0 0 1 0 1
         * + 1
         * ----------------
         * 0 0 0 0 0 1 1 0 -> 6
         * 
         * Output: -6
         * 
         * IN Code
         * ~ 0 -> (-1)
         */
        System.out.println(~5);
        System.out.println(~0);

        /*
         * Binary Left Shift
         * 
         * 
         * 5 << 2
         * 5 -> 0 0 0 1 0 1
         * 
         * 5 << 2 -> 0 1 0 1 0 0
         * 
         * Formula:
         * a << b = a * 2^b
         * 5 << 2 = 5 * 2^2 = 5 * 4 = 20
         */

        System.out.println(5 << 2);

        /*
         * Binary Right Shift
         * 
         * 
         * 6 >> 1
         * 5 -> 0 0 0 1 1 0
         * 
         * 6 >> 1 -> 0 0 0 0 1 1
         * 
         * Formula:
         * a >> b = a / 2^b
         * 6 >> 1 = 6 / 2^1 = 6 / 2 = 3
         */
        System.out.println(6 >> 1);

    }
}
