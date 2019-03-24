/* *************************************************
 * User: Gordon
 * Date: 16/03/19
 * Description: ElementSearchIn2dArray
 * find if an element is in a ascending row&column 2d array
 *
 **************************************************/

public class ElementSearchIn2dArray {

    public static boolean findElementByDiagonal(int[][] targetArray, int target) {

        validArray(targetArray);
        int row = targetArray.length;
        int column = targetArray[0].length;
        int rowPoint = 0;
        int columnPoint = column - 1;
        while (rowPoint < row && columnPoint >= 0) {

            if (targetArray[rowPoint][columnPoint] == target) {
                return true;
            } else if (targetArray[rowPoint][columnPoint] > target) {
                columnPoint--;
            } else {
                rowPoint++;
            }
        }

        return false;
    }


    private static void validArray(int[][] targetArray) {

        if (targetArray == null || targetArray.length == 0 || targetArray[0].length == 0) {
            throw new IllegalArgumentException();
        }

        //TODO: check the array ascending order

    }
}
