class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        /* 
        9 * 9 + 10 for n = 2
        9 * 9 * 8 + 10 for n = 3
        9 * 9 * 8 * 7 + 10 for n = 4
        9 * 9 * 8 * 7 * 6 + 10 for n = 5
        */   
        if(n==0)return 1;
        if(n==1)return 10;
        int product=9,result=10;

        for(int i=2;i<=n;i++){
            product=product*(11-i);
            result+=product;
        }
        return result;
    }
}