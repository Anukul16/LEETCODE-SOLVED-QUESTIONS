class Solution {
    public int [] get_nsl(int n , int [] heights){
        int [] NSL = new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty())NSL[i] = -1;
            else NSL[i] = st.peek();
            st.add(i);
        }
        return NSL;
    }
    public int [] get_nsr(int n , int [] heights){
        int [] NSR = new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty())NSR[i] = n;
            else NSR[i] = st.peek();
            st.add(i);
        }
        return NSR;
    }
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        
        int [] NSL = get_nsl(n,heights);
        
        int [] NSR = get_nsr(n,heights);
        
        int [] widths =new int[n];
        
        
        for(int i=0;i<n;i++){
            widths[i] = NSR[i] - NSL[i] - 1;
        }
        int area = 0;
        for(int i=0;i<n;i++){
            area = Math.max(area,heights[i] * widths[i]);
        }
        
        return area;
    }
}