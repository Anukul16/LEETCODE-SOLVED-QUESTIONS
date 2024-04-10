class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        int n = deck.length;
        Arrays.sort(deck);

        int result[] = new int[n];
        int i = 0, j = 0;
        boolean can_place = true;

        while (i < n) {
            if (result[j] == 0) {
                if (can_place == true) {
                    result[j] = deck[i];
                    i++;
                }
                can_place = !can_place;
            }
            j = (j + 1) % n;
        }
        return result;
    }
}