import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class one {
    public static void main(String[] args) {
        // System.out.println(count(3,3 ));
        // paths("", 3, 3);
        // System.out.println(pathsRet("", 3, 3));
        // pathsDiag("", 3, 3);
        // System.out.println(pathsDiagRet("", 3, 3));
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        // pathRestrictions("", maze,0,0);
        // pathRestrictions2("", maze,0,0);
        int[][] path = new int[3][3];
        allPathPrint("", maze, 0, 0, path, 1);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }



    static void paths(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1)  {
            paths(p + "D", r - 1, c);
        }

        if (c > 1) {
            paths(p + "R", r, c - 1);
        }

    }





    // return type is ArrayList
    static ArrayList<String> pathsRet(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1)  {
            list.addAll(pathsRet(p + 'D', r - 1, c));
        }

        if (c > 1) {
            list.addAll(pathsRet(p + 'R', r, c - 1));
        }
        return list;
    }







    // U can also move diagonally (i.e. u can move in 3 directions right, down, and diagonally)
    static void pathsDiag(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            pathsDiag(p + "D", r - 1, c);
        }

        if(c > 1) {
            pathsDiag(p + "R", r, c - 1);
        }

        if(r > 1 && c > 1) {
            pathsDiag(p + "X", r - 1, c - 1);
        }
    }




    // return type is ArrayList
    static ArrayList<String> pathsDiagRet(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1) {
            list.addAll(pathsDiagRet(p + "D", r - 1, c));
        }
        if(c > 1) {
            list.addAll(pathsDiagRet(p + "R", r, c - 1));
        }
        if(r > 1 && c > 1) {
            list.addAll(pathsDiagRet(p + "X", r - 1, c - 1));
        }
        return list;
    }













    // adding a obstacle at (1,1)
    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        if (r < maze.length  - 1 ) { 
            pathRestrictions(p + "D", maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + "R", maze, r, c + 1);
        }

    }

















    //you can movbe in all 4 directions (i.e. right, down, left, up) using (backtracking) (backtracking conditions are maze[r][c] = false; and maze[r][c] = true;)
    static void pathRestrictions2(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false; // mark the visited node as false

        if (r < maze.length  - 1 ) { 
            pathRestrictions2(p + "D", maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions2(p + "R", maze, r, c + 1);
        }

        if (r > 0) {
            pathRestrictions2(p + "U", maze, r - 1, c);
        }

        if (c > 0) {
            pathRestrictions2(p + "L", maze, r, c - 1);
        }

        // this line is where the function is over 
        // so before the function gets removed, also remove the changes that were made by that function.

        maze[r][c] = true; // undo the changes and mark the node as true

    }




















    // print all the paths
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step; // mark the visited node as false

        if (r < maze.length  - 1 ) { 
            allPathPrint(p + "D", maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + "R", maze, r, c + 1,  path, step + 1);
        }

        if (r > 0) {
            allPathPrint(p + "U", maze, r - 1, c,  path, step + 1);
        }

        if (c > 0) {
            allPathPrint(p + "L", maze, r, c - 1,  path, step + 1);
        }

        // this line is where the function is over 
        // so before the function gets removed, also remove the changes that were made by that function.

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
