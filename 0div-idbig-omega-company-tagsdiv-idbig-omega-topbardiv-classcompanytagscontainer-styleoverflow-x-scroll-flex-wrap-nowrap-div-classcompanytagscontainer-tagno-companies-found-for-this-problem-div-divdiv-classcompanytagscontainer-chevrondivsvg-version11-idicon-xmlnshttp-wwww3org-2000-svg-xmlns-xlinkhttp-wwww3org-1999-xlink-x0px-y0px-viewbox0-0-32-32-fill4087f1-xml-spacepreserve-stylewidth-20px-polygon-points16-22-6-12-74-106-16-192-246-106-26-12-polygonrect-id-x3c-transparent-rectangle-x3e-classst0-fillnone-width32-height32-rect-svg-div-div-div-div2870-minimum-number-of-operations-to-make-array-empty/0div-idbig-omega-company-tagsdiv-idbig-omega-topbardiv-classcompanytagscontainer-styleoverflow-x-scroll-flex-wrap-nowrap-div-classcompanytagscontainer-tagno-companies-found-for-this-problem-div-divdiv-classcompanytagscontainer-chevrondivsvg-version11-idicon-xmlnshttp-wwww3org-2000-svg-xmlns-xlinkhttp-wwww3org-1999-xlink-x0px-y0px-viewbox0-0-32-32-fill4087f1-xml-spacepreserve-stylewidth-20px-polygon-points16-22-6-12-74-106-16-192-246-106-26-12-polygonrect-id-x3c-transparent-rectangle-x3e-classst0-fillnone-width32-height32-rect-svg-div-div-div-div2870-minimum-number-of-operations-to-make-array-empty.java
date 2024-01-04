class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums)
            map.put(x, map.getOrDefault(x, 0) + 1);
        int ans = 0;
        for (int key : map.keySet()) {
            int val = map.get(key);
            if(val==1)return -1;
            ans+=Math.ceil((double)val/3);
        }
        return ans;
    }
}
/*
 if freq is 1 then return -1
 else   
 freq             operation 
 2                  1
 3                  1
 4                  2
 5                  2
 6                  2
 7                  3

 the freq is nothing but the ceiling value divided by 3
*/