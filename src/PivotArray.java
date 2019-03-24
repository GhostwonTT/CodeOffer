/* *************************************************
 * User: Gordon
 * Date: 24/03/19
 * Description: PivotArray
 * Pivot a sorted array and find the smallest number
 **************************************************/

public class PivotArray {

    public static int simpleWay(int[] array) {

        int previous = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < previous) {
                return array[i];
            } else {
                previous = array[i];
            }
        }
        return 0;
    }


    /**
     * Think the array can be divided by two sub sorted array, the division point is the pivot
     * @param array
     * @return
     */
    public static int searchByBinary(int[] array, int lo, int hi) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        if (array.length == 1) {
            return array[0];
        }
        // A special situation that move no elements, the input is a sorted array
        if (array[0] < array[1]) {
            return array[0];
        }
        // it means that lo is the last element in the first sorted array
        // hi is the first element in the second sorted array
        if (lo + 1 == hi) {
            return array[hi];
        }

        int middle = (lo + hi)/ 2;

        if (array[middle] > array[lo]) {
            lo = middle;
        } else if (array[middle] < array[hi]) {
            hi = middle;
        } else {
            // cannot tell the middle should be in the first sub or second sub
            int previous = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < previous) {
                    return array[i];
                } else {
                    previous = array[i];
                }
            }
        }

        return searchByBinary(array, lo, hi);

    }
}
