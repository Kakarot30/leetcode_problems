class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        // List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        function(0, nums, target, list, new ArrayList<>());
        return list;
    }
    private void function(int idx, int[] arr, int target, List<List<Integer>> ans , List<Integer> curr ){
        if(target<0){
            return ;
        }
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return ;
        }

        for(int i=idx;i<arr.length;i++){
            if(i>idx&&arr[i]==arr[i-1]){
                continue;
            }
            curr.add(arr[i]);
            function(i+1, arr, target-arr[i], ans, curr);
            curr.remove(curr.size()-1);
        }
    }
}