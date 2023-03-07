class Solution {
    public int minimumSum(int num) {
        String s=String.valueOf(num);
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String n1="",n2="";
        for(int i=0;i<ch.length;i++){
            if(i%2==0)n1+=ch[i];
            else n2+=ch[i];
        }
        return Integer.parseInt(n1)+Integer.parseInt(n2);
    }
}