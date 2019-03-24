/* *************************************************
 * User: Gordon
 * Date: 24/03/19
 * Description: AgeSorting
 * Age of 0 - 99
 * complexity is O(n)
 **************************************************/

public class AgeSorting {

    public static void sorting(int[] ages) {

        int[] steps = new int[100];

        for (int i = 0; i < ages.length; i++) {
            steps[ages[i]]++;
        }

        int count = 0;
        for (int i = 0; i < steps.length; i++) {
            for (int j = 0; j < steps[i]; j++) {
                ages[count] = i;
                count++;
            }
        }

        for (int i : ages) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 54 ,54, 12,34 ,34, 34 ,73,43 ,45,1 ,21 ,23,53, 2};
        AgeSorting.sorting(test);
    }
}
