class Solution {
    public long makeSimilar(int[] nums, int[] target) {
    // Intuition :- sort the arrays and add all even and odd in seperate list
     // then find the diff of even to even and odd to odd and the right shift
     // by two to the final result
        Arrays.sort(nums);
        Arrays.sort(target);
        List<Integer>evenNums=new ArrayList();
        List<Integer>oddNums=new ArrayList();
        List<Integer>evenTarget=new ArrayList();
        List<Integer>oddTarget=new ArrayList();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                evenNums.add(nums[i]);
            }else{
                oddNums.add(nums[i]);
            }
            if(target[i]%2==0){
                evenTarget.add(target[i]);
            }else{
                oddTarget.add(target[i]);
            }
        }
        long res=0;
        for(int i=0;i<evenNums.size();i++){
            res+=Math.abs(evenNums.get(i)-evenTarget.get(i));
        }
        for(int i=0;i<oddNums.size();i++){
            res+=Math.abs(oddNums.get(i)-oddTarget.get(i));
        }

        //System.out.println(evenNums+" "+oddNums+" "+evenTarget+" "+oddTarget);
        return res>>2;
    }
}