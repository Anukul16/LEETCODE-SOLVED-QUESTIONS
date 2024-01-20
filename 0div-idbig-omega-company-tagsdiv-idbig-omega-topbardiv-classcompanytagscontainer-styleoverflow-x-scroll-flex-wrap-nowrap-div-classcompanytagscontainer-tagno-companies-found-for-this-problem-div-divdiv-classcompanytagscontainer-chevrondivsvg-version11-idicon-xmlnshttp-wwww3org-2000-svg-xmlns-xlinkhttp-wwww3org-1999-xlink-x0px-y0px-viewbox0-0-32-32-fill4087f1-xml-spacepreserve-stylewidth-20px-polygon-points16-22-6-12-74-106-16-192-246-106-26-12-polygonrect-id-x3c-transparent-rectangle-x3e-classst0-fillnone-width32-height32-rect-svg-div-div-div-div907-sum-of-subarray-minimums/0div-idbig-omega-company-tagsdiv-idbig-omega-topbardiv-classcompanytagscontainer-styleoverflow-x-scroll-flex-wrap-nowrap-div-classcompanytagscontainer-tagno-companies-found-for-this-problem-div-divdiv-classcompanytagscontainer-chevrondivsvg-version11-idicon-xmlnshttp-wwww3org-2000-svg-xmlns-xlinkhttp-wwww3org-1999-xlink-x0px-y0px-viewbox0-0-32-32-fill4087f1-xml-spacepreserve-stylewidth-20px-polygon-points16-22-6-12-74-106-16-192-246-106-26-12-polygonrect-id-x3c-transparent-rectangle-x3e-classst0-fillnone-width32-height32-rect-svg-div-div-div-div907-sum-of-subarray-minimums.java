class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=(int)1e9+7;
        int[]NSL=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])st.pop();
            if(st.isEmpty())NSL[i]=-1;
            else NSL[i]=st.peek();
            st.add(i);
        }
        st.clear();
        int[]NSR=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])st.pop();
            if(st.isEmpty())NSR[i]=n;
            else NSR[i]=st.peek();
            st.add(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int ls=i-NSL[i];
            int rs=NSR[i]-i;
            int totalWays=ls*rs;
            long totalSum=(long)totalWays*arr[i];
            ans=(int) ((ans+totalSum) % mod);
            
        }
        // System.out.println(Arrays.toString(NSL));
        // System.out.println(Arrays.toString(NSR));
        return ans;
    }
}
/*

next smaller in left and next smaller in right korchi and tar index store korchi array te
at last calculate korchi total element kotogula ache left and right e then tar totalsum korchi and ans er sathe add korchi


*/