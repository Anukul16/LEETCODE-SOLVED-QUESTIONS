class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='1')cnt++;
        }
        
        int zeros=n-cnt;
        
        StringBuilder sb=new StringBuilder();
        while(cnt-->1){
            sb.append("1");
        }

        while(zeros-->0){
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
    
}



















// 10000111  we have 4 ones and 4 0's     11100001