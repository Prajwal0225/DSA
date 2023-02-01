public class Operations_on_Bits {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // seting ith bit to 1
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // clearing ith bit -> seting ith bit to '0'
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // 1st way
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        // 2nd way
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    // clear last i bits
    public static int clearIBit(int n, int i) {
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    // clear last i bits
    public static int clearBitsinRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int BitMask = a | b;

        return n & BitMask;
    }

    public static void main(String args[]) {

        // 10
        // 1 0 1 0 ---> 10
        // 3 2 1 0 ---> ith index
        System.out.println(getIthBit(10, 1));

        // 3
        // 0 1 1 ---> 3
        // 2 1 0 ---> ith index
        System.out.println(getIthBit(3, 0));

        // 1 0 1 0 ---> 10
        // 3 2 1 0 ---> ith index
        // seting 2nd bit to 1
        // 1 1 1 0 ---> result i.e 14
        System.out.println(setIthBit(10, 2));

        // 1 0 1 0 ---> 10
        // 3 2 1 0 ---> ith index
        // seting 1nd bit to 0
        // 1 0 0 0 ---> result i.e 8
        System.out.println(clearIthBit(10, 1));

        // 1 0 1 0 ---> 10
        // 3 2 1 0 ---> ith index i = 2 neBit = 1
        // seting 2nd bit to 1
        // 1 1 1 0 ---> result i.e 14
        System.out.println(updateIthBit(10, 2, 1));

        // 1 1 1 1 ---> 15
        // 3 2 1 0 ---> ith index i = 2 neBit = 1
        // seting last 2 bits to 0
        // 1 1 0 0 ---> result i.e 12
        System.out.println(clearIBit(15, 2));

        // 0 1 0 1 0 ---> 15
        // 4 3 2 1 0 ---> ith index i = 2 neBit = 1
        // clear bits form 2 to 4 to 0
        // 0 0 0 1 0 ---> result i.e 2
        System.out.println(clearBitsinRange(10, 2, 4));
    }
}
