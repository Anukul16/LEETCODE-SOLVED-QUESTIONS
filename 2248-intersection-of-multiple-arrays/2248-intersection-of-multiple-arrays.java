class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>ans=new ArrayList<>();
        int freq[]=new int[1001];
        for(int arr[]:nums){
            for(int num:arr){
                freq[num]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==nums.length)ans.add(i);
        }
        return ans;
    }
}