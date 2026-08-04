// Last updated: 8/4/2026, 12:44:10 PM
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int n = s.length();
4        int[] match = new int[n];
5        Arrays.fill(match, -1);
6
7        for (int i = 0; i < indices.length; i++) {
8            if (s.startsWith(sources[i], indices[i])) {
9                match[indices[i]] = i;
10            }
11        }
12
13        StringBuilder ans = new StringBuilder();
14        int i = 0;
15
16        while (i < n) {
17            if (match[i] != -1) {
18                ans.append(targets[match[i]]);
19                i += sources[match[i]].length();
20            } else {
21                ans.append(s.charAt(i));
22                i++;
23            }
24        }
25
26        return ans.toString();
27    }
28}