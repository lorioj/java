package main.logicalbitwiseoperator;

public class OperatorClient {

    public static void main(String[] args) {
        xor();
        not();

    }


    /**
     * ^ -> bitwise xor
     * If both are same → 0
     * If exactly one is 1 → 1
     *
     * 1 ^ 0 → 1
     * 0 ^ 1 → 1
     * 1 ^ 1 → 0
     * 0 ^ 0 → 0
     *
     * ^ = "not equal"
     *
     * a ^ b == 0   → equal
     * a ^ b != 0   → not equal
     *
     */
    static void xor(){
        int a = 3; // 0010
        int b = 3; // 0011
        int x = a ^ b;

        System.err.println(x);
    }

    /**
     *
     * Flips every bit (0 → 1, 1 → 0)
     * ! → Logical NOT
     * Works on:
     * boolean values only
     * What it does:
     * Flips true ↔ false
     *
     * ~ → Bitwise NOT
     * Works on:
     * int, byte, short, long, char
     *
     * (Not boolean)
     * ✅ What it does:
     *
     *
     */
    static void not(){
        // !
        boolean a = true;
        boolean b = false;
        boolean c =  !a;
        System.err.println(c);

        // ~
        int d  = 1;
        int e = 2; // 00000000 00000000 00000000 00000010
        int f = ~d;// 11111111 11111111 11111111 11111110
        /**
         * 11111111 11111111 11111111 11111101 > step 1 flip
         * +                                1  > two's complement add 1
         * ---------------------------------
         * 11111111 11111111 11111111 11111110 > result is  -2
         */
        //01111111111111111111111111111111 positive number(unsigned)
        //11111111111111111111111111111111 w negative number(signed)
        System.err.println(f); //result is - 2


        Integer max = Integer.MAX_VALUE; // 2147483647
        System.err.println("max " + max);

        Integer min = Integer.MIN_VALUE; // -2147483648
        System.err.println("min " + min);
        //-2147483648 to 2147483647 why not 2147483647 because 0 is also included



    }

}
