class Solution {
    public int[] sortArrayByParity(int[] nums) {

        for(int i=0,j=0;j<nums.length;j++){
            if(nums[j]%2==0){
                int temp=nums[i];
                nums[i++]=nums[j];
                nums[j]=temp;
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
        // for(int i=0;i<even.size();i++){
        //     nums[k++]=even.get(i);
        // }
        // for(int i=0;i<odd.size();i++){
        //     nums[k++]=odd.get(i);
        // }
        // return nums;
    }
}