// Last updated: 7/14/2026, 1:58:00 PM
import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Step 1: Put all jewels in a HashSet for quick lookup
        HashSet<Character> jewelSet = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }

        // Step 2: Count jewels in stones
        int count = 0;
        for (int i=0;i<jewels.length();i++) {
            for (int j=0;j<stones.length();j++) {
                if (jewels.charAt(i)==stones.charAt(j)){
                count++;
                }
            }
        }

        // Step 3: Return the result
        return count;
    }
}
