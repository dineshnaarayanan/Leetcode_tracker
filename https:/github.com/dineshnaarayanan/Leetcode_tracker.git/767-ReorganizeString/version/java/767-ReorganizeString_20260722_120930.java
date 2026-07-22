// Last updated: 7/22/2026, 12:09:30 PM
1import java.util.*;
2
3class Solution {
4    public String reorganizeString(String s) {
5
6        // Count frequency of each character
7        int[] freq = new int[26];
8
9        for (char ch : s.toCharArray()) {
10            freq[ch - 'a']++;
11        }
12
13        // Max Heap based on frequency
14        PriorityQueue<Character> pq = new PriorityQueue<>(
15            (a, b) -> freq[b - 'a'] - freq[a - 'a']
16        );
17
18        // Add all characters with frequency > 0
19        for (char ch = 'a'; ch <= 'z'; ch++) {
20            if (freq[ch - 'a'] > 0) {
21                pq.offer(ch);
22            }
23        }
24
25        StringBuilder ans = new StringBuilder();
26
27        while (pq.size() > 1) {
28
29            // Pick two most frequent characters
30            char first = pq.poll();
31            char second = pq.poll();
32
33            ans.append(first);
34            ans.append(second);
35
36            freq[first - 'a']--;
37            freq[second - 'a']--;
38
39            if (freq[first - 'a'] > 0)
40                pq.offer(first);
41
42            if (freq[second - 'a'] > 0)
43                pq.offer(second);
44        }
45
46        // One character left
47        if (!pq.isEmpty()) {
48
49            char last = pq.poll();
50
51            if (freq[last - 'a'] > 1)
52                return "";
53
54            ans.append(last);
55        }
56
57        return ans.toString();
58    }
59}