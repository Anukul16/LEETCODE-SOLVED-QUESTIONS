class Solution {
    public int[]get_NSR(int[]height){
        int n = height.length;
        Stack<Integer>st=new Stack<>();
        int[]NSR=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(st.isEmpty())NSR[i]=n;
            else NSR[i]=st.peek();
            st.add(i);
        }
        return NSR;
    }
    public int[]get_NSL(int[]height){
        int n = height.length;
        Stack<Integer>st=new Stack<>();
        int[]NSL=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(st.isEmpty())NSL[i]=-1;
            else NSL[i]=st.peek();
            st.add(i);
        }
        return NSL;
    }
    public int get_max_area(int[]height){
        // 2 0 1 2 1 if this is the array then 
        // NSR - NSL - 1 to get the width
        int n = height.length;
        int[]NSR=get_NSR(height);
        int[]NSL=get_NSL(height);
        int[]width = new int[n];
        for(int i=0;i<n;i++){
            width[i] = NSR[i] - NSL[i] -1;
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            int currArea = width[i] *  height[i];
            maxArea = Math.max(maxArea,currArea);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[]height = new int[m];

        for(int i=0;i<m;i++){
            height[i]=(matrix[0][i]=='1' ? 1 : 0);
        }
        int maxArea = get_max_area(height);

        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    height[j]+=1;
                }else{
                    height[j]=0;
                }
            }
            maxArea = Math.max(maxArea,get_max_area(height));
        }
        return maxArea;
    }
}