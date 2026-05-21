class Solution {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for(int val: arr1){
            while(!set.contains(val)&&val>0){
                set.add(val);

                val=val/10;
            }
        }
        int result =0;
        for(int nums: arr2){
            while(!set.contains(nums)&&nums>0){
                nums=nums/10;
            }
            if(nums>0){
                result = Math.max(result,(int) (Math.log10(nums)+1));
            }
        }
        return result;
    }
}