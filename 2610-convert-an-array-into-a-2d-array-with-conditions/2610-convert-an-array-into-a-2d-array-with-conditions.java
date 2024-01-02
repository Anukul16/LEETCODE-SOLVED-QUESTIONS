class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums)
            map.put(x, map.getOrDefault(x, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> map.get(a) == map.get(b) ? b - a : map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        while (!pq.isEmpty()) {
            int size = pq.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int curr = pq.poll();
                temp.add(curr);
                if (map.get(curr) == 1) {
                    map.remove(curr);
                } else {
                    map.put(curr, map.get(curr) - 1);
                }

            }
            ans.add(temp);
            pq.addAll(map.keySet());
        }

        return ans;
    }

}