// Last updated: 9/17/2026, 11:25:20 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
4        int left = 0;
5        int right = s.length() - 1;
6        while (left < right) {
7            if (s.charAt(left) != s.charAt(right)) {
8                return false;
9            }
10            left++;
11            right--;
12        }
13        return true;        
14    }
15}