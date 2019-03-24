/* *************************************************
 * User: Gordon
 * Date: 7/03/19
 * Description: Question1
 * generate a singleton instance for java class
 **************************************************/

public class Question1 {


    // In single thread
    private static Question1 instance = null;


    public Question1 getInstance() {
        if (instance == null) {
            instance = new Question1();
        }
        return instance;
    }

    public Question1() {
    }


    // In multiple thread (need to view java thread docs

}
