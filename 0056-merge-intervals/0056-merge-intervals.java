class Solution {
    public int[][] merge(int[][] intervals) {
        
        int[]newInterval=new int[2];
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        newInterval[0]=intervals[0][0];
        newInterval[1]=intervals[0][1];
        List<int[]>res=new ArrayList<>();
        for(int in[]:intervals){
            if(in[1]<newInterval[0]){
                res.add(in);
            }else if(in[0]>newInterval[1]){
                res.add(newInterval);
                newInterval=in;
            }else{
                newInterval[0]=Math.min(newInterval[0],in[0]);
                newInterval[1]=Math.max(newInterval[1],in[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);

        
    }
}