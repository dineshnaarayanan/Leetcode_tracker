// Last updated: 7/22/2026, 11:58:35 AM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.trim().split("\\s+");
5
6        StringBuilder ans = new StringBuilder();
7
8        for (int i = words.length - 1; i >= 0; i--) {
9            ans.append(words[i]);
10
11            if (i != 0) {
12                ans.append(" ");
13            }
14        }
15
16        return ans.toString();
17    }
18}