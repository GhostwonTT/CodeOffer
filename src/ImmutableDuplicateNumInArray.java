/* *************************************************
 * User: Gordon
 * Date: 12/03/19
 * Description: ImmutableDuplicateNumInArray
 **************************************************/

public class ImmutableDuplicateNumInArray {



    // time optimization O(n)
    public static int findDuplicateNum(int[] target) {

        validArray(target);

        int[] temp = new int[target.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = -1;
        }

        for (int i = 0; i < target.length; i++) {
            int num = target[i];
            if (temp[num] == -1) {
                temp[num] = num;
            } else {
                return num;
            }
        }
        return -1;
    }


    /**
     * space optimization O(nlogn)
     * @param target
     * @return duplicate num or -1 if there is no duplicate num
     */
    public static int findDuplicateNumByBinarySearch(int[] target) {

        validArray(target);

        int start = 1;
        int end = target.length - 1;

        while (end >= start) {
            int middle = (end + start) / 2;
            int count = countNum(start, middle, target);

            // check the minimum binary search data
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }

            if (count > (middle - start + 1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;

    }

    private static int countNum(int start, int middle, int[] target) {
        int count = 0;

        for (int i = 0; i < target.length; i++) {
            if (target[i] >= start && target[i] <= middle) {
                count++;
            }
        }
        return count;
    }
    private static void validArray(int[] target) {
        if (target == null || target.length == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < target.length; i++) {
            if (target[i] < 1 || target[i] >= target.length) {
                throw new IllegalArgumentException();
            }
        }
    }
}
