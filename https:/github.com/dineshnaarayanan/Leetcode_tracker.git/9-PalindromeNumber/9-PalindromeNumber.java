// Last updated: 7/14/2026, 1:58:59 PM
class Solution {
    public boolean isPalindrome(int x) {
        int ori=x;
        int rev=0;
        while(x>0){
            int digit =x%10;
            rev =rev*10+digit;
            x=x/10;
        }
        return(ori==rev);
    } 
        
    
}