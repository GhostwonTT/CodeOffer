/* *************************************************
 * User: Gordon
 * Date: 7/03/19
 * Description: DuplicateNumInArray
 * find the duplicate num in a int array
 * array length n
 * num range 0 ~ n - 1
 * get only one
 **************************************************/

public class DuplicateNumInArray {


    // Method one use quick sort and check the array
    // Method two use hashmap but we need another O(n) space
    // Method three check the index and value since num is from 0 to n - 1

    public static boolean existDuplicateNum(int[] source) {

        // check the array availability
        if (source == null || source.length == 0) {
            throw new IllegalArgumentException();
        }

        // check value
        for (int i = 0; i < source.length; i++) {
            if (source[i] < 0 || source[i] > source.length -1) {
                throw new IllegalArgumentException();
            }
        }

        for (int i = 0; i < source.length; i++) {
            while (source[i] != i) {
                if (source[source[i]] == source[i]) {
                    return true;
                } else {
                    int temp = source[i];
                    source[i] = source[temp];
                    source[temp] = temp;
                }
            }
        }
        return false;
    }

}
