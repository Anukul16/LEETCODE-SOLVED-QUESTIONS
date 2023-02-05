class Solution {
     public  int[] separateDigits(int[] nums) {
        
        List<Integer>list=new ArrayList();

        for(int i=nums.length-1;i>=0;i--){
            int num=nums[i];
            while(num>0){
                list.add(num%10);
                num/=10;
            }
        }
        int ans[]=new int[list.size()];
        int dcr=ans.length-1;
        for(int n:list){
            ans[dcr--]=n;
        }
        return ans;
     }
    
}