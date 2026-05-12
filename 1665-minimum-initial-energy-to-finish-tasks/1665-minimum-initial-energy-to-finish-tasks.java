class Solution {
    public int minimumEffort(int[][] tasks) {

         Arrays.sort(tasks, (a, b) -> 
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int l=0;
        int r = (int)1e9;

        int result = Integer.MAX_VALUE;
        
        while(l<=r){
            int mid = l+(r-l)/2;

            if(isPossible(tasks,mid)){
                result = mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result;
    }
    private boolean isPossible(int[][] tasks, int mid){
        for(int[] task: tasks){
            int actual = task[0];
            int minimum = task[1];

            if(minimum>mid){
                return false;
            }

            mid-=actual;
        }
        return true;
    }
}

