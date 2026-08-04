import java.util.ArrayList;

public class RecursionMaze {
    public static void main(String[] args) {
        // System.out.println(pathCount(3, 3));
        // pathPrint("", 3, 3);
        // System.out.println(pathPrintRet("", 3, 3));
        // pathPrintDiagonal("", 3, 3);
        // System.out.println(pathPrintDiagonalRet("", 3, 3));
        boolean[][] maze = {{true, true,true},{true, false, true},{true, true, true}};
        // pathPrintObstacle("", 0, 0, maze);
        pathAllDirections("", 0, 0, maze);
    }

    //Ques1 Count of Total Paths
    // static int pathCount(int r, int c) {
    //     if (r == 1 || c == 1) {
    //         return 1;
    //     }

    //     int left = pathCount(r - 1, c);
    //     int right = pathCount(r, c - 1);

    //     return left + right;
    // }

    //Ques2 Printing the actual path
    // static void pathPrint(String p, int r, int c) {
    //     if (r == 1 && c == 1) {
    //         System.out.println(p);
    //         return;
    //     }

    //     if (r > 1) {
    //         pathPrint(p + "D", r - 1, c);
    //     }
    //     if (c > 1) {
    //         pathPrint(p + "R", r, c - 1);
    //     }
    // }

    //Ques3 Print as ArrayList
    // static ArrayList<String> pathPrintRet(String p, int r, int c) {
    //     if (r == 1 && c == 1) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     ArrayList<String> list = new ArrayList<>();
    //     if (r > 1) {
    //         list.addAll(pathPrintRet(p + "D", r - 1, c));
    //     }
    //     if (c > 1) {
    //         list.addAll(pathPrintRet(p + "R", r, c - 1));
    //     }
    //     return list;
    // }

    // Ques4 Diagonal Path added
    // static void pathPrintDiagonal(String p, int r, int c) {
    //     if (r == 1 && c == 1) {
    //         System.out.println(p);
    //         return;
    //     }

    //     if (r > 1) {
    //         pathPrintDiagonal(p + "D", r - 1, c);
    //     }
    //     if (c > 1) {
    //         pathPrintDiagonal(p + "R", r, c - 1);
    //     }
    //     if (r > 1 && c > 1) {
    //         pathPrintDiagonal(p + "DG", r - 1, c - 1);
    //     }
    // }

    // Ques5 Diagonal Path added return as array list
    // static ArrayList<String> pathPrintDiagonalRet(String p, int r, int c) {
    //     if (r == 1 && c == 1) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     ArrayList<String> list = new ArrayList<>();
    //     if (r > 1 && c > 1) {
    //         list.addAll(pathPrintDiagonalRet(p + "DG", r - 1, c - 1));
    //     }
    //     if (r > 1) {
    //         list.addAll(pathPrintDiagonalRet(p + "D", r - 1, c));
    //     }
    //     if (c > 1) {
    //         list.addAll(pathPrintDiagonalRet(p + "R", r, c - 1));
    //     }
    //     return list;
    // }

    // Ques6 Maze with obstacle
    // static void pathPrintObstacle(String p, int r, int c, boolean[][] maze) {
    //     if (r == maze.length-1 && c == maze[0].length-1) {
    //         System.out.println(p);
    //         return;
    //     }

    //     if (!maze[r][c]) { // maze[c][r] == false
    //         return;
    //     }

    //     if (r < maze.length-1) {
    //         pathPrintObstacle(p + "D", r + 1, c, maze);
    //     }
    //     if (c < maze[0].length-1) {
    //         pathPrintObstacle(p + "R", r, c + 1, maze);
    //     }
    // }

    // Ques7 Path in all directions
    static void pathAllDirections(String p, int r, int c, boolean[][] maze) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) { // maze[c][r] == false
            return;
        }

        if (r < maze.length-1) {
            pathAllDirections(p + "D", r + 1, c, maze);
        }
        if (c < maze[0].length-1) {
            pathAllDirections(p + "R", r, c + 1, maze);
        }
        // if (r > 0) {
        //     pathAllDirections(p + "L", r, c-1, maze);
        // }
        // if (c > 0) {
        //     pathAllDirections(p + "U", r-1, c, maze);
        // }
    }
}
