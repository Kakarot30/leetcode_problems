class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int countless = 0;
        int equal = 0;
        for(int num: nums){
            if(num<pivot){
                countless++;
            }else if(num==pivot){
                equal++;
            }
        }
        int i=0;
        int j=countless;
        int k=countless+equal;

        int[] res = new int[n];
        for(int num: nums){
            if(num<pivot){
                res[i]=num;
                i++;
            }else if(num==pivot){
                res[j]=num;
                j++;
            }else{
                res[k]=num;
                k++;
            }
        }
        return res;
    }
}