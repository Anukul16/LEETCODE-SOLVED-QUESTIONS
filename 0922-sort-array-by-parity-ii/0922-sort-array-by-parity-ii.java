class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        List<Integer>even=new ArrayList();
        List<Integer>odd=new ArrayList();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            nums[i]=even.get(k++);
        }
        int k2=0;
        for(int i=1;i<nums.length;i+=2){
            nums[i]=odd.get(k2++);
        }
        return nums;
    }
}