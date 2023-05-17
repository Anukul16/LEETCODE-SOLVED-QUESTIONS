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
        int ndegree[]=new int[V];
       for(int i=0;i<V;i++){
           for(int x:adj.get(i)){
               ndegree[x]++;
           }
       }
       // add the elements into queue which ndegree is 0 initially
       Queue<Integer>q=new LinkedList<>();
       for(int i=0;i<V;i++){
           if(ndegree[i]==0)q.add(i);
       }
       int cnt=0;
       while(q.size()>0){
           // fetch the element 
          int node=q.poll();
          cnt++;
          // after fetching now do the ndegree elements 0 by and whenever it will be 0 insert it in the queue
          for(Integer it:adj.get(node)){
              ndegree[it]--;
              if(ndegree[it]==0){
                  q.add(it);
              }
          }
       }
        return cnt==V?false:true;
    }
}