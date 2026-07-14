// Last updated: 7/14/2026, 1:57:51 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0){
            int temp=n%10;
            sum=sum+temp;
            prod*=temp;
            n/=10;
        }
        int result =prod-sum;
        return result;
    }
}