class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String>map=new HashMap<>();
        for(List<String>list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder sb=new StringBuilder();
        int st=-1,end=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='('){
                sb.append(s.charAt(i));
            }else if(s.charAt(i)=='('){
                st=i+1;
                while(i<s.length() && s.charAt(i)!=')'){
                    i++;
                }
                end=i;
               sb.append(map.getOrDefault(s.substring(st,end),"?"));
            }
            
        }
        return sb.toString();
    }
}