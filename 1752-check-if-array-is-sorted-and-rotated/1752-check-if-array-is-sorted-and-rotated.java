class Solution {
    public boolean check(int[] nums) {
       if (nums==null||nums.length<=1){
        return true;
       }
       int drop = 0;
       for(int i=1; i<nums.length; i++){
        if(nums[i]<nums[i-1]){
            drop++;
        }
       }if(drop>1){
        return false;
       }if(drop==1){
        return nums[nums.length-1]<=nums[0];
       }
       return true;
    }
}