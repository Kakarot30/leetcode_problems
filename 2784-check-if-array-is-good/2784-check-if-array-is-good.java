class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        if(n!= max+1){
            return false;
        }
        int[] freq = new int[max+1];
        for( int num:nums){
            if(num>max||num<1){
                return false;
            }
            freq[num]++;
        }
        for(int i=1;i<max;i++){
            if(freq[i]!=1){
                return false;
            }
        }
        return freq[max]==2;
    }
}