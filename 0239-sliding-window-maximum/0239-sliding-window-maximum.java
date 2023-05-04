class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int ans[]=new int[n-k+1];
        int i=0,j=0;
        Deque<Integer>dq=new ArrayDeque<>();
        while(j<n){
            if(dq.isEmpty()){
                dq.add(arr[j]);
            }else{
                while(!dq.isEmpty() && arr[j]>dq.peekLast()){
                    dq.pollLast();
                }
                dq.add(arr[j]);
            }
            if(j-i+1==k){
                ans[i]=dq.peek();
                if(arr[i]==dq.peek()){
                    dq.pollFirst();
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
