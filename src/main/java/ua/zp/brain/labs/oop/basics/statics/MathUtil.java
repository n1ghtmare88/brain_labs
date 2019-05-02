package ua.zp.brain.labs.oop.basics.statics;

/**
 * Simple class with static methods, for demonstrate working with cycles in Java.
 * Help to calc several math sequences.
 *
 * @author Vladimir Bratchikov
 */
public class MathUtil {

    /**
     * Sum of several values.
     *
     * @param values values sequence
     * @return sum result.
     */
    public static int sum(int... values) {
        int result = 0;
        for (int a : values) {
            result += a;
        }
        return result;
    }

    /**
     * Multiply of several values.
     *
     * @param values values sequence
     * @return multiply result.
     */
    public static int mul(int... values) {
        int result = 0;

        result = values[0];
        for (int i = 1; i < values.length; i++) {
            result *= values[i];
        }
        return result;
    }

    /**
     * Print all numbers unless {@param interrupt }
     *
     * @param skipValue skipped value
     * @param values    values sequence
     */
    public static void printWithSkip(int skipValue, int... values) {

        for (int i = 0; i < values.length; i++) {
            if (values[i] == skipValue) continue;
            System.out.print(values[i] + " ");
        }

    }

    /**
     * Print all numbers before reaching {@param interrupt }
     *
     * @param interruptValue force end value
     * @param values         values sequence
     */
    public static void printToValue(int interruptValue, int... values) {

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
            if (values[i] == interruptValue) break;

        }
    }

    /**
     * Calc factorial value.
     *
     * @param a factorial value.
     * @return factorial result of {@param a}.
     */
    public static int factorial(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;

        }
        return result;
    }

    /**
     * Calc harmonic progression for value with ratio.
     *
     * @param a     base value
     * @param q     ratio
     * @param count calc count
     * @return harmonic progression result.
     */
    public static int harmonicProgression(int a, int q, int count) {
        int result;
        result = a * (int) Math.pow(q, count - 1);
        return result;
    }

    /**
     * Calc harmonic arithmetic for value with ratio.
     *
     * @param a     base value
     * @param q     ratio
     * @param count calc count
     * @return arithmetic progression result.
     */
    public static int arithmeticProgression(int a, int q, int count) {
        int result;
        result = a + q * (count - 1);
        return result;
    }

    private MathUtil() {
        // Denied to create instance of this class
    }
}
