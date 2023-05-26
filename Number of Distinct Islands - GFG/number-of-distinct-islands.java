//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Depth-first search (DFS) method
    void dfs(int row, int col, int[][] visited, int[][] grid, ArrayList<String> list, int row0, int col0) {
        // Base case and boundary conditions
        if (row < 0 || row == grid.length || col < 0 || col == grid[0].length || grid[row][col] == 0 || visited[row][col] == 1)
            return;

        // Mark current cell as visited
        visited[row][col] = 1;

        // Add the relative coordinates of the current cell to the list
        list.add(toString(row - row0, col - col0));

        // Recursively visit the neighboring cells
        dfs(row - 1, col, visited, grid, list, row0, col0); // Up
        dfs(row, col + 1, visited, grid, list, row0, col0); // Right
        dfs(row + 1, col, visited, grid, list, row0, col0); // Down
        dfs(row, col - 1, visited, grid, list, row0, col0); // Left
    }

    // Convert relative coordinates to string representation
    private String toString(int r, int c) {
        return Integer.toString(r) + " " + Integer.toString(c);
    }

    public int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        HashSet<ArrayList<String>> set = new HashSet<>();

        // Iterate over each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell is land and not visited, initiate DFS to explore the island
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    ArrayList<String> list = new ArrayList<>();
                    dfs(i, j, visited, grid, list, i, j);
                    set.add(list);
                }
            }
        }

        // Return the number of distinct islands
        return set.size();
    }
}

