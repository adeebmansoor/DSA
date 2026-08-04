import java.util.ArrayList;
import java.util.Arrays;

public class RecursionBacktracking {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true,true},{true, true, true},{true, true, true}};
        // backtracking("", 0, 0, maze);
        // System.out.println(backtrackingRet("", 0, 0, maze));
        int[][] path = new int[maze.length][maze[0].length];
        backtrackingNumPath("", 0, 0, maze, path, 1);

    }

    // Ques1 Backtracking
    static void backtracking(String p, int r, int c, boolean[][] maze) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) { // maze[c][r] == false
            return;
        }

        // Cell in the current path is turned false
        maze[r][c] = false;

        if (r < maze.length-1) {
            backtracking(p + "D", r + 1, c, maze);
        }
        if (c < maze[0].length-1) {
            backtracking(p + "R", r, c + 1, maze);
        }
        if (c > 0) {
            backtracking(p + "L", r, c-1, maze);
        }
        if (r > 0) {
            backtracking(p + "U", r-1, c, maze);
        }

        maze[r][c] = true;
    }

    // Ques2 Return all the paths as arraylist
    static ArrayList<String> backtrackingRet(String p, int r, int c, boolean[][] maze) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c]) { // maze[c][r] == false
            return list;
        }

        maze[r][c] = false;

        if (r < maze.length-1) {
            list.addAll(backtrackingRet(p + "D", r + 1, c, maze));
        }
        if (c < maze[0].length-1) {
            list.addAll(backtrackingRet(p + "R", r, c + 1, maze));
        }
        if (c > 0) {
            list.addAll(backtrackingRet(p + "L", r, c-1, maze));
        }
        if (r > 0) {
            list.addAll(backtrackingRet(p + "U", r-1, c, maze));
        }

        // this line is where the function gets over hence before function gets removed, changes made by this function should also be removed  
        maze[r][c] = true;
        return list;
    }

    // Ques3 Printing the matrix path of backtracking in numbers
    static void backtrackingNumPath(String p, int r, int c, boolean[][] maze, int[][] path, int step) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            path[r][c] = step;
            for (int[] num : path) {
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) { // maze[c][r] == false
            return;
        }

        // Cell in the current path is turned false
        maze[r][c] = false;
        // Updating the steps values
        path[r][c] = step;

        if (r < maze.length-1) {
            backtrackingNumPath(p + "D", r + 1, c, maze, path, step + 1);
        }
        if (c < maze[0].length-1) {
            backtrackingNumPath(p + "R", r, c + 1, maze, path, step + 1);
        }
        if (c > 0) {
            backtrackingNumPath(p + "L", r, c-1, maze, path, step + 1);
        }
        if (r > 0) {
            backtrackingNumPath(p + "U", r-1, c, maze, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
