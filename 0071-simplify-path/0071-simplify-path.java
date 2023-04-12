class Solution {
    public String simplifyPath(String path) {
      String arr[]=path.split("/");
    Stack<String>stack=new Stack<>();
   
    for(String s:arr){
        if(s.equals(".") || s.equals(""))continue;

        if(!s.equals(".."))stack.push(s);
        else if(!stack.isEmpty()) stack.pop();
    }
    
    if(stack.isEmpty())return "/";
   String ans="";
    while(!stack.isEmpty()){
        ans="/"+stack.peek()+ans;
        stack.pop();
    }
    return ans;
    }
}