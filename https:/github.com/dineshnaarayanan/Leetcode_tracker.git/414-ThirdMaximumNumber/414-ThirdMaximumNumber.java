// Last updated: 7/14/2026, 1:58:09 PM
class Solution {
    public int thirdMax(int[] nums) {
       
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
      } 
     int[] arr=new int[set.size()];
     int k=0;
    for(int i :set){
        arr[k]=i;
        k++;
    }
   
    if(arr.length==1) return arr[0];
     if(arr.length==2){
            if(arr[0]>arr[1]){
                return arr[0];
            }
            else{
                return arr[1];
            }
        }
    Arrays.sort(arr);
    return arr[arr.length-3];
    }
}