class Solution {
    int result = Integer.MAX_VALUE;
    int n ;
    public int distributeCookies(int[] cookies, int k) {
        n = cookies.length;
        int[] children = new int[k];
        solve(0,children,cookies,k);
        return result;
     }
    private void solve(int idx, int[] children, int[] cookies, int k){
        if(idx==n){
            int ans = 0;
            for(int child: children){
                ans= Math.max(ans,child);
            }
            result = Math.min(ans,result);
            return;
        }
        int candy = cookies[idx];
        for(int i=0;i<k;i++){
            children[i]+=candy;
            solve(idx+1,children,cookies,k);
            children[i]-=candy;
        }
    }
}