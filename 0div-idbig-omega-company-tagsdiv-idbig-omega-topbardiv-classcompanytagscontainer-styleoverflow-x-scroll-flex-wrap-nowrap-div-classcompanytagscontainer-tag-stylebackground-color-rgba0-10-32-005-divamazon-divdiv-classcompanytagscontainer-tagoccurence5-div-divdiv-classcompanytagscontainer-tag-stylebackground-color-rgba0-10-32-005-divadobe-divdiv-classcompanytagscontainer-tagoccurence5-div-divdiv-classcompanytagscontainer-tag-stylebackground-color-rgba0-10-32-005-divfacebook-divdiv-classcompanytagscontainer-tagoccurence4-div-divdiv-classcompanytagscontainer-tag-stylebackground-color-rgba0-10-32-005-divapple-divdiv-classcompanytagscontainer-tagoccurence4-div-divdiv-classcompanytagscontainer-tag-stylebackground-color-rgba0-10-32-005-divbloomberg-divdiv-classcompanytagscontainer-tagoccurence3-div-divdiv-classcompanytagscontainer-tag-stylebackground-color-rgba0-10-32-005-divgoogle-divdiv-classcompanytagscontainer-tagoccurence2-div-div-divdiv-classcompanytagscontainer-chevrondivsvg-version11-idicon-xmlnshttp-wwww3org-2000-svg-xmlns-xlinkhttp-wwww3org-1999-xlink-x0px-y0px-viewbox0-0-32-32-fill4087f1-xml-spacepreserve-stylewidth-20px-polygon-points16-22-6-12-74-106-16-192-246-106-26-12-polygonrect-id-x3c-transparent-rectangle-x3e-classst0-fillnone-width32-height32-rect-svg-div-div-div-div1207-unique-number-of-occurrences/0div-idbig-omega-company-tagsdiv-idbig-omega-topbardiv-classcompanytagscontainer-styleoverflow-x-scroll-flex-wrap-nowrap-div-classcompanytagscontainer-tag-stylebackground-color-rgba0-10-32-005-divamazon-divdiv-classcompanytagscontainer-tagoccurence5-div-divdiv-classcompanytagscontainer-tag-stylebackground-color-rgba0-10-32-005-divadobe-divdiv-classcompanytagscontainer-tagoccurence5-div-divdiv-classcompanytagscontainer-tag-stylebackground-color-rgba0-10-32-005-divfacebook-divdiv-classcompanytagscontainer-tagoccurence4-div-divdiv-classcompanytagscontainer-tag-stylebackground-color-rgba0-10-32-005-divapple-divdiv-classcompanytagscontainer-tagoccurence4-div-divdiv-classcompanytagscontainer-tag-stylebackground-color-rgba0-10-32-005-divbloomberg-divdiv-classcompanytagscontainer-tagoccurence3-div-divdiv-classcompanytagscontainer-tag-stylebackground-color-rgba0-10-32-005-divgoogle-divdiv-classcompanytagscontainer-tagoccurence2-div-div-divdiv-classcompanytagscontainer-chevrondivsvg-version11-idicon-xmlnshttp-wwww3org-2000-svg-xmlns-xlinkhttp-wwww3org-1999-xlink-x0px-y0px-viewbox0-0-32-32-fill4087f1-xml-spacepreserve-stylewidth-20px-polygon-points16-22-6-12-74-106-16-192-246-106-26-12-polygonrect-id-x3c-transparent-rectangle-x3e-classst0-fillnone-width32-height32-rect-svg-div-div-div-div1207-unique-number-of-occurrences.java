class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);
        return new HashSet<>(map.values()).size() == map.size();
    }
}