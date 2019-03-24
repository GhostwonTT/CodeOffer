/* *************************************************
 * User: Gordon
 * Date: 24/03/19
 * Description: Fibonacci
 * just like the frog jump step f(n) = f(n-1) + f(n-2)
 **************************************************/

public class Fibonacci {

    /**
     * Easy to implement but it need n exponential complexity
     * @param n
     * @return
     */
    public static int normalFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return normalFibonacci(n - 1) + normalFibonacci(n - 2);
        }
    }


    /**
     * Save memory and time
     * save the small term first
     * @param n
     * @return
     * complexity is O(n)
     */
    public static int saveMemFibonacci(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }

        int fibNumOne = 0;
        int fibNumTwo = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = fibNumOne + fibNumTwo;
            fibNumOne = fibNumTwo;
            fibNumTwo = fib;
        }
        return fib;
    }
}
