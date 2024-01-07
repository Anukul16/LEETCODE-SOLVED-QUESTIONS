class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer>[] map=new HashMap[n];
        for(int i=0;i<n;i++){
            map[i]=new HashMap<>();
        }  
        int ans = 0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                long diff = (long)nums[i] - (long)nums[j];

                if(diff<=Integer.MIN_VALUE || diff>=Integer.MAX_VALUE){
                    continue;
                }

                int apEndingOnJ = map[j].getOrDefault((int)diff,0);
                int apEndingOnI = map[i].getOrDefault((int)diff,0);// dry run tc 2
                // System.out.println(i+","+j+"->"+apEndingOnI+" ");
                ans+=apEndingOnJ;
                map[i].put((int)diff,1+apEndingOnJ+apEndingOnI);

            }
        }
        return ans;
    }
}
/*
taking hashmap for every index
storing diffs , if in jth index map diff is present take it same as ith index 
add into the ans and put into the map for upcoming operations 

*/