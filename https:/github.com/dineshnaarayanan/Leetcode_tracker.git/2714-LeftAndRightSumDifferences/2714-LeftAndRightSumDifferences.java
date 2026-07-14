// Last updated: 7/14/2026, 1:57:31 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] left =new int [nums.length];
        int [] right=new int [nums.length];
        int [] result=new int[nums.length];
        if (nums.length==1){
            result[0]=0;
            return result;
        }
        left[0]=0;right[right.length-1]=0;
        int k=0,l=nums.length-1;
        for (int i=1,j=nums.length-2;i<nums.length&& j>=0;i++,j--){
            left[i]=left[k]+nums[i-1];
            right[j]=right[l]+nums[l];
            k++;
            l--;
        }
        for (int i=0;i<nums.length;i++){
            result[i]=Math.abs(left[i]-right[i]);
        }
        return result;
    }
}