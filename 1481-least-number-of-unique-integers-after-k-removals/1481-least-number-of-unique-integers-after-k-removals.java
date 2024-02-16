class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       
      Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        pq.addAll(map.keySet());
        while (!pq.isEmpty() && k > 0) {
            int currVal = pq.poll();
            if (map.containsKey(currVal)) { // Checking if key exists in the map
                if (k >= map.get(currVal)) {
                    k -= map.get(currVal);
                    map.remove(currVal);
                } else {
                    break;
                }
            }
        }
        
        return map.size();
    
    }
}