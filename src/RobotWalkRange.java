/* *************************************************
 * User: Gordon
 * Date: 24/03/19
 * Description: RobotWalkRange
 * Robot could move in a m * n matrix, but cannot move into a point that i + j > k
 * Start from (0, 0)
 **************************************************/

public class RobotWalkRange {

    public static int numOfRange(int m, int n, int k) {

        if (m <= 0 && n <= 0) {
            throw new IllegalArgumentException();
        }
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        count = findPoint(m - 1, n - 1, k, 0, 0, visited);
        return count;
    }


    private static int findPoint(int m, int n, int k, int x, int y, boolean[][] visited) {

        int count = 0;
        if (x <= m && x >= 0 && y <= n && y >= 0) {
            if (visited[x][y] || !canWork(x, y, k)) {
                return 0;
            } else {
                visited[x][y] = true;
                count += 1 + findPoint(m, n, k, x - 1, y, visited) + findPoint(m, n, k, x + 1, y , visited) +
                        findPoint(m, n, k, x, y - 1, visited) + findPoint(m, n, k, x, y + 1, visited);
            }
        }
        return count;
    }


    private static boolean canWork(int x, int y, int k) {
        int count = 0;
        while (x >= 10) {
            count += x % 10;
            x = x / 10;
        }
        count += x;

        while (y >= 10) {
            count += y % 10;
            y = y / 10;
        }

        count += y;

        return !(count > k);
    }
}
