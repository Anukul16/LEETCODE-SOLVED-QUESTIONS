class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[]ans=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                int prev = st.pop();
                ans[prev]=i-prev;
            }
            st.add(i);
        }
        
        return ans;
    }
}