class Solution {
    void buildGraph(TreeNode root,int parent,Map<Integer,List<Integer>>map){
        if(root==null)
            return;
        if(parent != -1){
            map.computeIfAbsent(root.val,k->new ArrayList<>()).add(parent);
        }
        if(root.left != null){
            map.computeIfAbsent(root.val,k->new ArrayList<>()).add(root.left.val);
        }
        if(root.right != null){
            map.computeIfAbsent(root.val,k->new ArrayList<>()).add(root.right.val);
        }
        buildGraph(root.left,root.val,map);
        buildGraph(root.right,root.val,map);
    }
    public int amountOfTime(TreeNode root, int start) {
        
        Queue<Integer>q=new LinkedList<>();
        Map<Integer,List<Integer>>adj=new HashMap<>();
        Set<Integer>vis=new HashSet<>();
        buildGraph(root,-1,adj);
        // System.out.println(adj.toString());
        q.add(start);
        int ans = 0;
        vis.add(start);
        
        while(!q.isEmpty()){
            int n = q.size();
            while(n-- > 0){
                int node = q.poll();
                for(int it : adj.getOrDefault(node,new ArrayList<>())){
                    if(!vis.contains(it)){
                        vis.add(it);
                        q.add(it);
                    }
                }
            }
            ans++;
        }
        return ans-1;
    }
}