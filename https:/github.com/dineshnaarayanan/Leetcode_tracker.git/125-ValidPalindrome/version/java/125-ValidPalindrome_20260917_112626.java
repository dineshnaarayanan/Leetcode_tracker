// Last updated: 9/17/2026, 11:26:26 AM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int sp = 0;
4        int tp = 0;
5        while (sp < s.length() && tp < t.length()) {
6            if (s.charAt(sp) == t.charAt(tp)) {
7                sp++;
8            }
9            tp++;
10        }
11
12        return sp == s.length();        
13    }
14}