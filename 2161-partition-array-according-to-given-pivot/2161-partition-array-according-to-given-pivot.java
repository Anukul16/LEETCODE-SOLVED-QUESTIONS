class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       
       List<Integer>smallerElements=new ArrayList();
       List<Integer>sameElements=new ArrayList();
       List<Integer>greaterElements=new ArrayList();

       for(int i=0;i<nums.length;i++){
           if(nums[i]<pivot)smallerElements.add(nums[i]);
           else if(nums[i]==pivot)sameElements.add(nums[i]);
           else greaterElements.add(nums[i]);
       }
       int k=0;
       for(int i=0;i<smallerElements.size();i++){
           nums[k++]=smallerElements.get(i);
       }
       for(int i=0;i<sameElements.size();i++){
           nums[k++]=sameElements.get(i);
       }
       for(int i=0;i<greaterElements.size();i++){
           nums[k++]=greaterElements.get(i);
       }
       return nums;
    }
}