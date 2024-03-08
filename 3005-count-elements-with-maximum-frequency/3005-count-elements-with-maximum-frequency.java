class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = -1;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        
        int answer = 0;
        for (int element : frequencyMap.keySet()) {
            if (frequencyMap.get(element) == maxFrequency) {
                answer += maxFrequency;
            }
        }
        
        return answer;
    }
}
