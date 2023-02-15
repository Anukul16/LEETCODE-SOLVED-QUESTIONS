class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>ans=new ArrayList<>();
        int i=num.length-1;
        
        while(i>=0 || k>0){
            if(i>=0){
                ans.add(0,(num[i]+k)%10);
                k=(num[i]+k)/10;
            }else{
                ans.add(0,k%10);
                k/=10;
            }
            i--;
        }
        return ans;
    }
}