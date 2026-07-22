// Last updated: 7/22/2026, 12:22:18 PM
import java.util.*;

class Solution {
    public String reorganizeString(String s) {

        // Count frequency of each character
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> freq[b - 'a'] - freq[a - 'a']
        );

        // Add all characters with frequency > 0
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq[ch - 'a'] > 0) {
                pq.offer(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (pq.size() > 1) {

            // Pick two most frequent characters
            char first = pq.poll();
            char second = pq.poll();

            ans.append(first);
            ans.append(second);

            freq[first - 'a']--;
            freq[second - 'a']--;

            if (freq[first - 'a'] > 0)
                pq.offer(first);

            if (freq[second - 'a'] > 0)
                pq.offer(second);
        }

        // One character left
        if (!pq.isEmpty()) {

            char last = pq.poll();

            if (freq[last - 'a'] > 1)
                return "";

            ans.append(last);
        }

        return ans.toString();
    }
}