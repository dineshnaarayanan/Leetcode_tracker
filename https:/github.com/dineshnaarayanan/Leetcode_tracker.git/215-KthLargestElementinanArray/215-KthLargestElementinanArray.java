// Last updated: 7/15/2026, 12:15:34 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        Arrays.sort(nums);
4        int count = 0;
5        for (int i = nums.length - 1; i >= 0; i--) {
6            count++;
7            if (count == k) {
8                return nums[i];
9            }
10        }
11        return -1;
12    }
13}