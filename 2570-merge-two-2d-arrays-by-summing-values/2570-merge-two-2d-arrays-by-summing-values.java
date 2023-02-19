class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer>map=new TreeMap();

        for(int[]a:nums1)map.put(a[0],a[1]);
        for(int[]b:nums2)map.put(b[0],map.getOrDefault(b[0],0)+b[1]);
        int res[][]=new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            res[i][0]=entry.getKey();
            res[i][1]=entry.getValue();
            i++;
        }
        return res;
    }
}