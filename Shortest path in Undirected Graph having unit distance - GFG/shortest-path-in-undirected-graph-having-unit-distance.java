//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public int[] shortestPath(int[][] edges, int n, int m, int src) {
        // Create adjacency list to represent the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        // Build the adjacency list using the given edges
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        // Initialize distance array to track the minimum distance from the source node
        int[] distance = new int[n];
        Arrays.fill(distance, 101); // Initialize with a large value (101 in this case)

        // Perform Breadth-First Search to find the shortest path
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        distance[src] = 0; // Distance from the source node to itself is 0
        while (q.size() > 0) {
            int node = q.poll();
            // Iterate through all the neighbors of the current node
            for (int it : adj.get(node)) {
                // Update the distance if a shorter path is found
                if (distance[node] + 1 < distance[it]) {
                    distance[it] = 1 + distance[node];
                    q.add(it);
                }
            }
        }

        // Convert any remaining nodes with distance 101 to -1 (indicating unreachable nodes)
        for (int i = 0; i < n; i++) {
            if (distance[i] == 101)
                distance[i] = -1;
        }

        // Return the array of minimum distances from the source node
        return distance;
    }
}
