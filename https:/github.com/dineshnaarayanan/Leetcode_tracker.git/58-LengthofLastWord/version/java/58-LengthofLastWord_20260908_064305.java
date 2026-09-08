// Last updated: 9/8/2026, 6:43:05 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int n = s.length();
4        int i = n - 1;
5        int len = 0;
6
7        while(i >= 0 && s.charAt(i) == ' '){
8            i--;
9        }
10        while(i >= 0 && s.charAt(i) != ' '){
11            len++;
12            i--;
13        }
14        return len;
15    }
16}