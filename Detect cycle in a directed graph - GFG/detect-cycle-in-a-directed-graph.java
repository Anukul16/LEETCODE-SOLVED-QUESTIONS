//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
       boolean[]visited=new boolean[V];
       boolean[]pathVisited=new boolean[V];
       for(int i=0;i<V;i++){
           if(visited[i]==false){
               if(dfs(i,visited,pathVisited,adj)==true)return true;
           }
       }
       return false;
    }
    private boolean dfs(int node,boolean[]visited,boolean[]pathVisited,ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        pathVisited[node]=true;
        for(int it:adj.get(node)){
            if(visited[it]==false){
                if(dfs(it,visited,pathVisited,adj)==true)return true;
            }else if(pathVisited[it]==true){
                return true;
            }
        }
        // here
        pathVisited[node]=false;
        return false;
    }
}
/* 

We will have a visited and pathVisited array 

We check from 0 to V ..... if we get visited[i]=false then call the dfs for that node

In dfs function what we are doing is just 
        At first mark both the array as visited
        
        Then iterating throuhg the current nodes adj list if that node is unvisited then 
        call the dfs and so on
        And keep in mind whenever at the time of return of any recursion make sure to unvsited 
        the pathVistied array cause now you are not on that path
        
        And if anytime you encountered a situation where the node is visited and the pathVisited 
        array is also visited, it means there is a cycle for sure..cause you started from that 
        node now again you are on the node in a path


*/