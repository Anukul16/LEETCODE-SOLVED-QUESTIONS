class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        int minlen = Integer.MAX_VALUE, start = 0;

        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int i = 0, j = 0, count = mp.size();

        while (j < s.length()) {
            if (mp.containsKey(s.charAt(j))) {
                mp.put(s.charAt(j), mp.get(s.charAt(j)) - 1);
                if (mp.get(s.charAt(j)) == 0) {
                    count--;
                }
            }

            while (count == 0) {
                if (mp.containsKey(s.charAt(i))) {
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
                    if (mp.get(s.charAt(i)) == 1) {
                        count++;
                        if (j - i + 1 < minlen) {
                            minlen = j - i + 1;
                            start = i;
                        }
                    }
                }
                i++;
            }

            j++;
        }

        if (minlen == Integer.MAX_VALUE)
            return "";
        return s.substring(start, start + minlen);
    }
}