class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer,Character>tm=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            tm.put(indices[i],s.charAt(i));
        }
        String ans="";
        for(Map.Entry<Integer,Character>mp:tm.entrySet()){
            ans+=mp.getValue();
        }
        return ans;
    }
}