class Solution {
    int n ;
    public List<List<Integer>> findSubsequences(int[] nums) {
      n = nums.length;
      List<List<Integer>> result = new ArrayList<>();
      
      List<Integer> curr = new ArrayList<>();
      backtrack(nums, 0, new ArrayList<Integer>(), result);
      return result;
    }
    private void backtrack(int[] nums, int idx, List<Integer> curr, List<List<Integer>> result){
        if(curr.size()>=2){
            result.add(new ArrayList<Integer>(curr));
        }
        Set<Integer> st = new HashSet<>();
        for(int i=idx;i<n;i++){
            if((curr.size()==0||nums[i]>=curr.get(curr.size() - 1))&&!st.contains(nums[i])){
                st.add(nums[i]);
                curr.add(nums[i]);
                backtrack(nums,i+1,curr,result);
                curr.remove(curr.size()-1);
            }
        }
    }
}