class Solution {
    void solve(Queue<String>q,StringBuilder curr,Set<String>deadends){
        for(int i=0;i<4;i++){
            char ch = curr.charAt(i);
            char inc = (ch=='9') ? '0' : (char) (ch+1);
            char dec = (ch=='0') ? '9' : (char) (ch-1);
            
            curr.setCharAt(i,inc);
            if(!deadends.contains(curr.toString())){
                q.add(curr.toString());
                deadends.add(curr.toString());
            }
            curr.setCharAt(i,dec);
            if(!deadends.contains(curr.toString())){
                q.add(curr.toString());
                deadends.add(curr.toString());
            }
            curr.setCharAt(i,ch);
        }
    }
    public int openLock(String[] deadends, String target) {
        Set<String>dead=new HashSet<>();
        for(String s:deadends)dead.add(s);

        Queue<String>q=new LinkedList<>();
        String source = "0000";

        if(dead.contains(source)){
            return -1;
        }
        q.add(source);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                String curr = q.poll();
                if(curr.equals(target)){
                    return level;
                }
                solve(q,new StringBuilder(curr),dead);
            }
            level++;
        }
        return -1;
    }
}