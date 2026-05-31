class Solution {
    public boolean asteroidsDestroyed(int mass, int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long curr = mass;
        for(int i=0;i<n;i++){
            if(curr>=nums[i]){
                curr+=nums[i];
            }else{
                return false;
            }
        }
        return true;
    }
}