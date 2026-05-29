class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            ans = Math.min(ans, sum);
        }
        return ans;
    }
}