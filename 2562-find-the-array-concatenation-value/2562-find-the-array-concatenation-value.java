class Solution {
    public long findTheArrayConcVal(int[] nums) {
            long sum=0;
            int first=0,last=nums.length-1;
            while(first<=last){
               if(first==last){
                   sum+=nums[first];
               }else{
                // String s1=Long.toString(nums[first]);
                // String s2=Long.toString(nums[last]);
                // String s=s1+s2;
                // sum+=Long.parseLong(s);
                sum += Long.parseLong(""+nums[first]+nums[last]);
               }
                
                first++;
                last--;
            }
            return sum;
        
    }
}