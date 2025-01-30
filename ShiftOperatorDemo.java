public class ShiftOperatorDemo {
    public static void main(String[] args) {
        // Declare a number
        int number = 8; // Binary: 00001000

        int leftShift = number << 2; // Equivalent to multiplying by 2^2 (4)
        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        System.out.println("After left shift (number << 2): " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");

        // Right shift operator (>>)
        // Shifts bits to the right and preserves the sign bit (for negative numbers)
        int rightShift = number >> 2; // Equivalent to dividing by 2^2 (4)
        System.out.println("After right shift (number >> 2): " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");

        // Demonstrating right shift with a negative number
        int negativeNumber = -8; // Binary: 11111111 11111111 11111111 11111000 (in 32-bit two's complement)
        int negativeRightShift = negativeNumber >> 2;
        System.out.println("Original negative number: " + negativeNumber + " (Binary: " + Integer.toBinaryString(negativeNumber) + ")");
        System.out.println("After right shift (negativeNumber >> 2): " + negativeRightShift + " (Binary: " + Integer.toBinaryString(negativeRightShift) + ")");

        // Unsigned right shift (>>>)
        int unsignedRightShift = negativeNumber >>> 2;
        System.out.println("After unsigned right shift (negativeNumber >>> 2): " + unsignedRightShift + " (Binary: " + Integer.toBinaryString(unsignedRightShift) + ")");
    }
}
