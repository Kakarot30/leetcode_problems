class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        long ans = max-min;
        long total = ans*k;
        return total;
    }
}