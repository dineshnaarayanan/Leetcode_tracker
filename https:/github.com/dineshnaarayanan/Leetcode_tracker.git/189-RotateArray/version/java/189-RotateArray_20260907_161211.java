// Last updated: 9/7/2026, 4:12:11 PM
1class Solution {
2    public void reverse(int[] nums, int start, int end) {
3        while (start < end) {
4            int temp = nums[start];
5            nums[start] = nums[end];
6            nums[end] = temp;
7
8            start++;
9            end--;
10        }
11    }
12
13    public void rotate(int[] nums, int k) {
14        int n = nums.length;
15
16        k = k % n; 
17        reverse(nums, 0, n - 1);
18        reverse(nums, 0, k - 1);
19
20        reverse(nums, k, n - 1);
21    }
22}