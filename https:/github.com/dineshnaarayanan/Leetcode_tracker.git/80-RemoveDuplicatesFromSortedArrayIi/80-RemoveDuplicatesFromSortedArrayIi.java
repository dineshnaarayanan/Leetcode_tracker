// Last updated: 7/14/2026, 1:58:34 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[k-2]){
                nums[k]=nums[i];
                k++;

            }
        }
        return k;

    }
}