class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer>bracket_stack = new Stack<>();
        Stack<Integer>asterik_stack = new Stack<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                bracket_stack.add(i);
            }else if(s.charAt(i) == '*'){
                asterik_stack.add(i);
            }else{
                if(!bracket_stack.isEmpty())bracket_stack.pop();
                else{
                    if(!asterik_stack.isEmpty())asterik_stack.pop();
                    else return false;
                }
            }
        }
        // if bracket stack is nonempty
        if(!bracket_stack.isEmpty()){
            while(!bracket_stack.isEmpty() && !asterik_stack.isEmpty()){
                if(bracket_stack.peek()<asterik_stack.peek()){
                    bracket_stack.pop();
                    asterik_stack.pop();
                }else{
                    return false;
                }
            }
        }
        return bracket_stack.size() == 0;
    }
}