class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums1)
            set.add(x);
        
        int minVal=Integer.MAX_VALUE;
        for(int x:nums2){
            if(set.contains(x) && minVal>x)
                minVal=x;
        }
        return minVal != Integer.MAX_VALUE ? minVal : -1 ;
    }
}