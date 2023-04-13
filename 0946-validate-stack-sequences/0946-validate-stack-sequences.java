class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>s=new Stack<>();
        int i=0,j=0,n=pushed.length;
        while(i<n && j<n){
            s.push(pushed[i]);
            while(!s.isEmpty() && popped[j]==s.peek()){
                s.pop();
                j++;
            }
            i++;
        }
        return s.isEmpty();
    }
}