class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer>ans=new ArrayList<>();
        if(n == 1){
            ans.add(0);
            return ans;
        }
        Map<Integer,List<Integer>>adj = new HashMap<>();
        int[]indegree=new int[n];
        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        // creating adj list
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            indegree[u]++;
            indegree[v]++;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }       
        // System.out.println(adj);
        Queue<Integer>q=new LinkedList<>();
        // if indegree is 1 means leaf node so put it to queue
        for(int i=0;i<n;i++){
            if(indegree[i] == 1){
                q.add(i);
            }
        }
        // ans will always be 1 or 2,if it is lesser than 2 means i got my ans
        while(n > 2){
            int size = q.size();
            // substract the whole level(size) from the n and iterate over whole level
            n-=size;
            while(size-- > 0){
                int curr = q.poll();
                for(int x:adj.get(curr)){
                    indegree[x]--;
                    // if indegree 1 means again we are getting leaf node while moving to the center of tree
                    if(indegree[x] == 1){
                        q.add(x);
                    }
                }
            }
        }
        
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        return ans;
    }
}