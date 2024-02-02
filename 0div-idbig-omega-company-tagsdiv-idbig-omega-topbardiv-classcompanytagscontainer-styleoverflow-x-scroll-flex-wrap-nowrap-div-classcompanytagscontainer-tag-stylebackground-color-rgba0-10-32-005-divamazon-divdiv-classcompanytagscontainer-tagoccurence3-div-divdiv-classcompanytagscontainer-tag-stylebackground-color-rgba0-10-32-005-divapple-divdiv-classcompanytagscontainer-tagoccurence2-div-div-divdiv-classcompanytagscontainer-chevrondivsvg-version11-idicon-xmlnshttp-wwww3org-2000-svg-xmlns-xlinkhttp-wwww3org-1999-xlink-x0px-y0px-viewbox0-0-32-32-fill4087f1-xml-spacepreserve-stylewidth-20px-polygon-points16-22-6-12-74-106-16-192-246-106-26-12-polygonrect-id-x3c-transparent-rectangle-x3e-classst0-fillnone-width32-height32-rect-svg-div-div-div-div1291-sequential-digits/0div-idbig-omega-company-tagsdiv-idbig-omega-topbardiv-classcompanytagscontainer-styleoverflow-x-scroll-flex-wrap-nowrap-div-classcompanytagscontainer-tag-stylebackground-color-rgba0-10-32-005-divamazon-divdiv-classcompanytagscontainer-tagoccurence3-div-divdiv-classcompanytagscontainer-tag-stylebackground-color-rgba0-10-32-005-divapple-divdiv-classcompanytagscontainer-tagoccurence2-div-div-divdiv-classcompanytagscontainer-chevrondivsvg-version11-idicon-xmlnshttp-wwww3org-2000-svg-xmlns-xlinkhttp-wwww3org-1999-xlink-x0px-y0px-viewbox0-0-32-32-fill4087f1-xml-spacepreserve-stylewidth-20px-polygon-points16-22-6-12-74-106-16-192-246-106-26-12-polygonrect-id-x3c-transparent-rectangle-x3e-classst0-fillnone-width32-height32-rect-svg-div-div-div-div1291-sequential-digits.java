class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>ans=new ArrayList<>();
        
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=8;i++)q.add(i);

        while(!q.isEmpty()){
            int n = q.poll();
            if(n>=low && n<=high){
                ans.add(n);
            }
            int rem = n % 10;
            if(rem+1 <= 9){
                int res = n*10 + (rem+1);
                q.add(res);
            }
            
        }
        return ans;
    }
}
