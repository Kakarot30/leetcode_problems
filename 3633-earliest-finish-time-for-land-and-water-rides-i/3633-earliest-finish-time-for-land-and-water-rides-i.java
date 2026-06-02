class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for(int i=0;i<n;i++){
            min1 = Math.min(min1,landStartTime[i]);
        }
        for(int i=0;i<m;i++){
            min2 = Math.min(min2,waterStartTime[i]);
        }
        min3 = Math.min(min1,min2);

        int earliestFinish = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int landFinish = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFinish, waterStartTime[j]);
                int waterFinish = waterStart + waterDuration[j];
                earliestFinish = Math.min(earliestFinish, waterFinish);

                int waterFinishFirst = waterStartTime[j] + waterDuration[j];
                int landStartSecond = Math.max(waterFinishFirst, landStartTime[i]);
                int landFinishSecond = landStartSecond + landDuration[i];
                earliestFinish = Math.min(earliestFinish, landFinishSecond);
            }
        }
        
        return earliestFinish;
    }
}