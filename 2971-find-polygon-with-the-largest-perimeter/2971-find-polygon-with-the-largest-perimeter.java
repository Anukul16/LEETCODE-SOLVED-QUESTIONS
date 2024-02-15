import java.util.Arrays;

public class Solution {
    public long largestPerimeter(int[] sides) {
        Arrays.sort(sides);

        int count = 0;
        long totalSum = 0, temporarySum = 0;
        totalSum = 1L * (sides[0] + sides[1]);
        count = 2;

        for (int i = 2; i < sides.length; i++) {
            if (1L * sides[i] < totalSum) {
                totalSum += 1L * sides[i];
                temporarySum = totalSum;
                count++;
            } else {
                totalSum += 1L * sides[i];
            }
        }
        if (count == 2) {
            return -1;
        }
        return temporarySum;
    }
}
