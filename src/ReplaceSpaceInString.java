/* *************************************************
 * User: Gordon
 * Date: 16/03/19
 * Description: ReplaceSpaceInString
 * when merge two sort array, think about merge from the tail to reduce the number of movements
 **************************************************/

public class ReplaceSpaceInString {

    public static String replaceSpace(String target) {

        validString(target);
        int numOfSpace = 0;

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == ' ') {
                numOfSpace++;
            }
        }

        int pointOne = 0;
        int pointTwo = 0;

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numOfSpace; i++) {

            while(target.charAt(pointTwo) != ' ') {
                pointTwo++;
            }

            // end point is exclusive
            str.append(target.substring(pointOne, pointTwo));
            str.append("%20");
            pointTwo++;
            pointOne = pointTwo;

        }

        str.append(target.substring(pointOne));

        System.out.println(str.toString());

        return str.toString();

    }

    private static void validString(String target) {
        if (target == null) {
            throw new IllegalArgumentException("The String is null");
        }
    }
}
