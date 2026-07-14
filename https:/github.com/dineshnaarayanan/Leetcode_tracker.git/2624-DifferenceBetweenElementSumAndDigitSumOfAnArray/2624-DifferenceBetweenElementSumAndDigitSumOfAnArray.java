// Last updated: 7/14/2026, 1:57:39 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int num : nums)
        {
            elementSum += num;
            digitSum += digSum(num);
        }      

        return Math.abs(elementSum-digitSum);
    }
    public static int digSum(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}