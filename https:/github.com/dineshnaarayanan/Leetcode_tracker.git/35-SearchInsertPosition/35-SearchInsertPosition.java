// Last updated: 7/14/2026, 1:58:42 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int key=0;
        int n=nums.length;
        int i=1;
        if(target==nums[0]){
            return 0;
        }
        else if(target<nums[0]){
            return 0;
        }

        while(i<n){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i-1]<target && nums[i]>=target){
                return i;
            }
            else{
                i++;
            }
        }
        return n;
    }
}