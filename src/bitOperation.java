/* *************************************************
 * User: Gordon
 * Date: 25/03/19
 * Description: bitOperation
 * read a decimal number and return the number of 1 in its binary format
 * java show binary code as Complement
 **************************************************/

public class bitOperation {

    /**
     * if you use divide, the time consumption is to high
     * @param num
     * @return
     */
    public static int getNumOfOne(int num) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((num & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static int getNumOfOneBySustract(int num) {
        int count = 0;
        while (num != 0) {
            num = (num - 1) & num;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = -9;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a>>1);
        System.out.println(getNumOfOne(13));
        System.out.println(getNumOfOneBySustract(13));
    }


}
