class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer>st=new Stack<>();
        Set<Integer>set=new HashSet<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')st.add(i);
            else if(s.charAt(i)==')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    set.add(i);
                }
            }
        }
        while(!st.isEmpty()){
            set.add(st.pop());
        }
        String ans = "";
        
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                ans+=s.charAt(i);
            }
        }
        
        return ans;
    }
}