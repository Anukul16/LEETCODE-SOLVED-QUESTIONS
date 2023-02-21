class Solution {
    public boolean isPerfectSquare(int num) {
        // for(int i=1;i<=Math.sqrt(num);i++){
        //     if(i*i==num)return true;
        // }
        // return false;
        if(num==1)return true;
        long left=2,right=num/2;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==num)return true;
            else if(mid*mid>num)right=mid-1;
            else left=mid+1;
        }
        return false;
    }
}