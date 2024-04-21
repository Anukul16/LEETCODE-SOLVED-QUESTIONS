class Solution {
    public boolean solve(int n,int s,int d,List<List<Integer>>adj,int[]vis){
        if(s==d)return true;
        vis[s]=1;
        for(int x:adj.get(s)){
            if(vis[x]==0){
                if(solve(n,x,d,adj,vis))return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        // System.out.println(adj);

        int vis[]=new int[n];
        return solve(n,source,destination,adj,vis);

    }
}