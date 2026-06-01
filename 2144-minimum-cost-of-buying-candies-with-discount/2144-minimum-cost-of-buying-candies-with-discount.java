class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int sum = 0;
        if (n == 1) {
            return cost[0];
        }
        if (n == 2) {
            return cost[0] + cost[1];
        }
        for (int i = n - 3; i >= 0; i -= 3) {
            cost[i] = 0;
        }
        for (int i = n - 1; i >= 0; i--) {
            sum += cost[i];
        }
        return sum;
    }
}