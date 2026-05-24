class Solution {
    int n ;
    int[] t;
    private int solve(int[] arr, int i, int d){
        if(t[i]!=-1){
            return t[i];
        }
        int result =1;
        //left traversal
        for(int j = i-1; j>=Math.max(0,i-d);j--){
            if(arr[j]>=arr[i]) break;

            result = Math.max(result, 1+solve(arr,j,d));
        }
        //right traversal
        for(int j = i+1; j<=Math.min(n-1,i+d);j++){
            if(arr[j]>=arr[i]) break;

            result = Math.max(result, 1+solve(arr,j,d));
        }
        return t[i] =  result;
    }
    public int maxJumps(int[] arr, int d) {
        n = arr.length;
        int result = 1;
        t = new int[n];
        Arrays.fill(t,-1);
        for (int i=0;i<n;i++){
            result = Math.max(result, solve(arr,i,d));
        }
        return result ;        
    }
}