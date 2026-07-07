class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        long sum =0;
        while(n>0){
            int r = n%10;
            if(r>0){
                sb.insert(0, r);
                sum = sum +r;
            }
            n = n/10;
        }
        long num = Integer.parseInt(sb.toString());
        return num*sum;
    }
}