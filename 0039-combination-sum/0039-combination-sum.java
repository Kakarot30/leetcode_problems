class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        function(0,nums, target, list, new ArrayList<>());
        return list;
    }
    private void function(int idx,int[] arr,  int target, List<List<Integer>> ans , List<Integer> ds ){
        if(idx == arr.length){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }

        if(arr[idx]<=target){
            ds.add(arr[idx]);
            function(idx, arr, target-arr[idx], ans ,ds);
            ds.remove(ds.size()-1);
        }
        function(idx+1, arr, target, ans ,ds);
    }
}