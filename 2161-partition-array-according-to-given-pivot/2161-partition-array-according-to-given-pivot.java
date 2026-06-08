class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        int i=0;
        int j=n-1;

        int i_ = 0;
        int j_ = n-1;

        int[] res = new int[n];

        while(i<n&&j>=0){
            if(nums[i]<pivot){
                res[i_]=nums[i];
                i_++;
            }
            if(nums[j]>pivot){
                res[j_]=nums[j];
                j_--;
            }
            i++;
            j--;
        }
        while(i_<=j_){
            res[i_]=pivot;
            i_++;
        }
        return res;
    }
}