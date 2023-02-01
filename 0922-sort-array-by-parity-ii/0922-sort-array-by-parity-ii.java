class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int i=0,j=1;

        while(i<nums.length && j<nums.length){
            if(nums[i]%2==0)i+=2;
            else{
                if(nums[j]%2!=0)j+=2;
                else{
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
        // List<Integer>even=new ArrayList();
        // List<Integer>odd=new ArrayList();

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]%2==0){
        //         even.add(nums[i]);
        //     }else{
        //         odd.add(nums[i]);
        //     }
        // }
        // int k=0;
        // for(int i=0;i<nums.length;i+=2){
        //     nums[i]=even.get(k++);
        // }
        // int k2=0;
        // for(int i=1;i<nums.length;i+=2){
        //     nums[i]=odd.get(k2++);
        // }
        // return nums;
    }
}