class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int[][]res=new int[n/3][3];
        int j=0;
        for(int i=0;i<n;){
            int[]temp=new int[3];
            int idx =0;
            while(i<n && idx!=3){
                temp[idx++]=nums[i++];
            }
            // System.out.println(Arrays.toString(temp));
            if(Math.abs(temp[0]-temp[2]) > k) return new int[][]{};
            else res[j++]=temp;
        }
        return res;
    }
}