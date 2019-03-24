/* *************************************************
 * User: Gordon
 * Date: 24/03/19
 * Description: CutString
 * A dynamic planning problem
 * Give a string of length n, how to cut the string to get the max multiply result
 **************************************************/

public class CutString {

    /**
     * Solved by Dynamic Programming
     * solve small to big problem
     * @param length
     * @return
     */
    public static int maxResultByDP(int length) {

        if (length < 2) {
            return 0;
        } else if (length == 2) {
            return 1;
        } else if (length == 3) {
            return 2;
        }

        int[] product = new int[length + 1];
        product[0] = 0;
        product[1] = 1;
        product[2] = 2;
        product[3] = 3;

        for (int i = 4; i <= length; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int temp = product[j] * product[i - j];
                if (max < temp) {
                    max = temp;
                }
            }
            product[i] = max;
        }
        return product[length];
    }


    public static int maxResultByGreedy(int length) {

        if (length < 2) {
            return 0;
        } else if (length == 2) {
            return 1;
        } else if (length == 3) {
            return 2;
        }

        // cut by 3
        int timesOf3 = length / 3;
        // if the rest is 1 is not good, need to have 4
        if (length - timesOf3 * 3 == 1) {
            timesOf3--;
        }
        // get 4 to 2 and 2
        int timesOf2 = (length - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3) * Math.pow(2, timesOf2));
    }
}
