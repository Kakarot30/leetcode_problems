class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        int[] current = intervals[0];
        list.add(current);

        for(int i=1;i<n;i++){
            if(current[1]>=intervals[i][0]){
                current[1]=Math.max(current[1],intervals[i][1]);
            }else{
                current = intervals[i];
                list.add(current);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}