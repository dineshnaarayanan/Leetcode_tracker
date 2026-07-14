// Last updated: 7/14/2026, 1:57:44 PM
class Solution {
    public boolean isSameAfterReversals(int num) 
    {
        if(num==0)
            return true;
        
        int n = num; //store original number

        StringBuilder r1 = new StringBuilder(); //reverse1
        while(num!=0)
        {
            int d = num%10;
            r1.append(String.valueOf(d));
            num = num/10;
        }
        int num2 = Integer.valueOf(r1.toString());

        StringBuilder r2 = new StringBuilder(); //reverse2
        while(num2!=0)
        {
            int d = num2%10;
            r2.append(String.valueOf(d));
            num2 = num2/10;
        }
        int num3 = Integer.valueOf(r2.toString()); //convert to int

        return n==num3;
    }
}