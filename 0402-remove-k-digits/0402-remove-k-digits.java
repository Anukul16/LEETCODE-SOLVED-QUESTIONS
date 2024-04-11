
class Solution {
    public String removeKdigits(String num, int k) {
        
        int n = num.length();
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            if(st.isEmpty() && ch!='0'){
                st.add(ch);
            }else{
                st.add(ch);
            }
        }
        // if k is > 0 then for e.g -> 1,2,3,4 or eg "9" and k =1
        while (!st.isEmpty() && k-- > 0)
            st.pop();
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        String ans=sb.toString();
        // remove leading 0's
        int idx = 0;
        while(idx<ans.length() && ans.charAt(idx)=='0'){
            idx++;
        }
        ans=ans.substring(idx,ans.length());
        return ans.length()==0 ? "0" : ans;
    }
}
