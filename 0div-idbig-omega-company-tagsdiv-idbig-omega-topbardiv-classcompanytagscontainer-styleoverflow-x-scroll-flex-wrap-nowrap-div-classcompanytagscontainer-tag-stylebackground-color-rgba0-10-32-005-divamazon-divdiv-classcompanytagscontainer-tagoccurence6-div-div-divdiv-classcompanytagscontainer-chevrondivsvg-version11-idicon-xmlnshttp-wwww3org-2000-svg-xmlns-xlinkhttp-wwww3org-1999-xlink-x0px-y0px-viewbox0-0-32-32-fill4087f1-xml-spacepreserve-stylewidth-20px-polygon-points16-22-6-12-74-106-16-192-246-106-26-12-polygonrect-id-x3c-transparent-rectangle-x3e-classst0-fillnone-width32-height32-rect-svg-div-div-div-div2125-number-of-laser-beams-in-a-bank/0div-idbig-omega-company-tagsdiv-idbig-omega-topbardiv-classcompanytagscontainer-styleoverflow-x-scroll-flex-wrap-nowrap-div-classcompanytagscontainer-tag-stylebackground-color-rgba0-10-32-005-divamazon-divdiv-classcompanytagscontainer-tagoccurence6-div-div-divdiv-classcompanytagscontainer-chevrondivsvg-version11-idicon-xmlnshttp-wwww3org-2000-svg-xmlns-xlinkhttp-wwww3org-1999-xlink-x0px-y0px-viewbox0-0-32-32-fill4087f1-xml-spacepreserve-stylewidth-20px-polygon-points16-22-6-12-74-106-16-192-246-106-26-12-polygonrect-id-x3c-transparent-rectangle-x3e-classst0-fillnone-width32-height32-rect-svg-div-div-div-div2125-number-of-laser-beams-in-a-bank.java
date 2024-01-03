class Solution {
    public int numberOfBeams(String[] bank) {
        int n =bank.length;

        int prev=0,ans=0;
        for(int i=0;i<n;i++){
            String s = bank[i];
            int curr=0;
            for(char c:s.toCharArray()){
                if(c=='1')curr++;    
            }
            ans+=(prev*curr);
            if(curr!=0){
                prev=curr;
            }
            
        }
        return ans;
    }
}