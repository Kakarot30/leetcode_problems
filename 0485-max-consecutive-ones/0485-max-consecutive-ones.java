class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n= nums.length;
        int start =0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                start++;
            }else{
                start=0;
            }max = Math.max(max,start);
        }
        return max;
    }
}