package ro.sci.functions.math;

/**
 * Class description
 */

public class Calculator {

    /**
     *
     * @param x
     * @param y
     * @return sum of x and y
     */
    public int aduna(int x, int y) {
       return x+y;
    }

    /**
     * Recursive function to calculate fibonacci
     * @param n
     * @return
     */
    public int fibonacci (int n) {

        if (n == 0 || n ==1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
