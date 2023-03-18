class Solution {
    public String arrangeWords(String text) {
        
        String str[]=text.toLowerCase().split(" ");
        // sorting by the string length
        Arrays.sort(str,(o1,o2)->o1.length()-o2.length());
        String res=String.join(" ",str);
        // now i get the answer now i have to do the first character uppercase 
        return Character.toUpperCase(res.charAt(0))+res.substring(1);
    }
}