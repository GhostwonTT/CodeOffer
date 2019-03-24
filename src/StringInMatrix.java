/* *************************************************
 * User: Gordon
 * Date: 24/03/19
 * Description: StringInMatrix
 * Search if there is a path of string in the matrix
 **************************************************/

public class StringInMatrix {

    public static boolean existThePath(String str, char[][] martix) {

        if (str == null || martix == null) {
            throw new IllegalArgumentException();
        }

        int row = martix.length;
        int col = martix[0].length;
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (findPath(str, martix, row - 1, col - 1, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findPath(String str, char[][] martix, int row, int col, int x, int y, boolean[][] visited) {

        if (str.length() == 0) {
            return true;
        }

        boolean hasPath = false;

        if (x <= row && x >= 0 && y <= col && y >= 0 && martix[x][y] == str.charAt(0) && !visited[x][y]) {
            visited[x][y] = true;
            hasPath = findPath(str.substring(1), martix, row, col, x - 1, y, visited) ||
                      findPath(str.substring(1), martix, row, col, x + 1, y, visited) ||
                      findPath(str.substring(1), martix, row, col, x , y - 1, visited) ||
                      findPath(str.substring(1), martix, row, col, x , y + 1, visited);

            if (!hasPath) {
                visited[x][y] = false;
            }
        }

        return hasPath;


    }
}
