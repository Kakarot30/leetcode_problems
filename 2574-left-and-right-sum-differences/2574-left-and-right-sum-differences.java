class Solution {
    public int[] leftRightDifference(int[] nums) {
        // int n = nums.length;
        // int[] rightSum = new int[n];
        // int[] leftSum = new int[n];
        // leftSum[0]=0;
        // for(int i=1;i<n;i++){
        //     leftSum[i]=leftSum[i-1]+nums[i-1];
        // }
        // rightSum[n-1]=0;
        // for(int i=n-2;i>=0;i--){
        //     rightSum[i]=rightSum[i+1]+nums[i+1];
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=Math.abs(leftSum[i]-rightSum[i]);
        // }
        // return nums;
        int sum =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];
        }
        int[] result = new int[n];
        int curr= 0;
        for(int i =0;i<n;i++){
            int leftSum = curr;
            curr+=nums[i];
            int rightSum = sum-curr;
            result[i]= Math.abs(leftSum-rightSum);
        }
        return result;
    }
}