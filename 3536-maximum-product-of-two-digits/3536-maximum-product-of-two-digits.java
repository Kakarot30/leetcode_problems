class Solution {
    public int maxProduct(int n) {
        int[] ans = new int[10];
        int i=0;
        while(n>0){
            int r = n%10;
            n = n/10;
            ans[i]=r;
            i++;
        }
        Arrays.sort(ans);
        return ans[9]*ans[8];
    }
}