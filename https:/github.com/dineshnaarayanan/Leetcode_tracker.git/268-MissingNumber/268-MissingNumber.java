// Last updated: 7/14/2026, 1:58:12 PM
class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length==1){
            if(nums[0]!=1){
                return 1;
            }else{
                return 0;
            }
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                return nums[i]+1;
            }
            if (nums[nums.length-1]!=nums.length){
                return nums.length;
            }
        }
    return 0;
        
    }
}