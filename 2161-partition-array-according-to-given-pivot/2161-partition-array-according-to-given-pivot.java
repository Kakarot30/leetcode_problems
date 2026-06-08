class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                list1.add(nums[i]);
            }else if(nums[i]>pivot){
                list2.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                list1.add(nums[i]);
            }
        }
        list1.addAll(list2);
        return list1.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}