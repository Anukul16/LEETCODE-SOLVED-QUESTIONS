class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer>map=new HashMap();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // inserting the characters of s into the map
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            // here first condition is the chracter must have into the map otherwise return false
            if(map.get(c)!=null){
                // if  the character value is 1 then remove it or else decrease it by one in the map
                if(map.get(c)==1){
                    map.remove(c);
                }else{
                    map.put(c,map.get(c)-1);
                }
            }else{
                return false;
            }
        }
        // at last if the map would be empty it means the string s and t contains same words 
        return map.isEmpty();

        
        // if(s.length()!=t.length())return false;
        // char ch[]=s.toCharArray();
        // char ch2[]=t.toCharArray();

        // Arrays.sort(ch);
        // Arrays.sort(ch2);


        // for(int i=0;i<ch.length;i++){
        //     if(ch[i]!=ch2[i])return false;
        // }

        // // for(char c:ch)System.out.print("first ->" + c+ " ");
        // // for(char c:ch2)System.out.print("second ->" + c+ " ");
        // return true;
       
    }
}
        
  