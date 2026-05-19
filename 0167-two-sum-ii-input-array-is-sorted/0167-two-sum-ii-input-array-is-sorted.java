class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int n = numbers.length;
        int a =0;
        int b = n-1;
        
        while(a<b){
            int sum = numbers[a]+numbers[b];
            if(sum==target){
                res[0]=a+1;
                res[1]=b+1;
            }
            if(sum<target){
                a++;
            }else{
                b--;
            }
        }
        return res;
    }
}