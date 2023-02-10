class Solution {
    public String frequencySort(String s) {
        // see notes 
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
      }

      ArrayList<Character>chars=new ArrayList<>(map.keySet());
      Collections.sort(chars,(a,b)->map.get(b)-map.get(a));

      String result="";
      for(char ch:chars){
          for(int it=0;it<map.get(ch);it++)
                result+=ch;
      }
      return result;
        
    }
}