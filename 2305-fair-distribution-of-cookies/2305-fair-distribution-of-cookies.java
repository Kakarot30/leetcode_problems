class Solution {
    int result = Integer.MAX_VALUE;
    int n ;
    public int distributeCookies(int[] cookies, int k) {
        n = cookies.length;
        int[] child = new int[k];
        solve(0,child,cookies,k);
        return result;
     }
    private void solve(int idx, int[] child, int[] cookies, int k){
        if(idx==n){
            int ans = 0;
            for(int childs: child){
                ans= Math.max(ans,childs);
            }
            result = Math.min(ans,result);
            return;
        }
        int candy = cookies[idx];
        for(int i=0;i<k;i++){
            child[i]+=candy;
            solve(idx+1,child,cookies,k);
            child[i]-=candy;
        }
    }
}