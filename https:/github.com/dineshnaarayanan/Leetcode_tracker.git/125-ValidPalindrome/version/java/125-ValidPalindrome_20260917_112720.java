// Last updated: 9/17/2026, 11:27:20 AM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int sm = 0;
4        int tv = 0;
5        while (sm < s.length() && tv < t.length()) {
6            if (s.charAt(sm) == t.charAt(tv)) {
7                sm++;
8            }
9            tv++;
10        }
11        return sm == s.length();        
12    }
13}