public class BitwiseShiftUsage {
    public static void main(String[] args) {
        int p = 10; // Binary: 1010
        int q = 6;  // Binary: 0110

        // Bitwise Logic
        System.out.println("--- Bitwise Logic ---");
        System.out.println("AND (p & q): " + (p & q)); // Result: 2 (0010)
        System.out.println("OR  (p | q): " + (p | q)); // Result: 14 (1110)
        System.out.println("XOR (p ^ q): " + (p ^ q)); // Result: 12 (1100)
        System.out.println("NOT (~p): "    + (~p));    // Result: -11 (Two's complement)

        // Shift Operations (Power of 2 Math)
        int num = 10;
        System.out.println("\n--- Shift Operations ---");
        // Left shift by 1 is same as multiplying by 2^1
        System.out.println("Left Shift (10 << 1): " + (num << 1));

        // Right shift by 1 is same as dividing by 2^1
        System.out.println("Right Shift (10 >> 1): " + (num >> 1));

        // Unsigned Right Shift (fills with 0 regardless of sign)
        int negativeNum = -10;
        System.out.println("Unsigned Right Shift (-10 >>> 1): " + (negativeNum >>> 1));
    }
}