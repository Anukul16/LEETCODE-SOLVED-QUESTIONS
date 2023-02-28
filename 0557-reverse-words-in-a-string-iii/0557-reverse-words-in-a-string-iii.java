class Solution {
    public String reverseWords(String s) {
        String temp[]=s.split(" ");
        String ans="";
        for(int i=0;i<temp.length;i++){
            String s2=temp[i];
           if(i!=temp.length-1) ans+=reverse(s2)+" ";
           else ans+=reverse(s2);
        }
        return ans;
    }
    public String reverse(String str){
        char charArr[]=str.toCharArray();
        int first=0,last=charArr.length-1;
        while(first<=last){
            char ch=charArr[first];
            charArr[first]=charArr[last];
            charArr[last]=ch;
            first++;
            last--;
        }
       String res=new String(charArr);
       return res;
    }
}