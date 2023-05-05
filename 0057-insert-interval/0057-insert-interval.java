class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>res=new ArrayList<>();

        for(int[]in:intervals){
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
/*

First if condition is for,
 if interval ka last value chota hai newInterval k first value se iska 
 matlab hai ye non-overlapping hai isko result k andar add krdo

Second else if condition is for,
    if anytime Interval ka first value bada ho jaye newInterval ka last value se to iska matlab hai ki samay a chuka hai newInterval ko result me add krne ka and 
    newInterval ko interval se update krne ka

    for e.g.--> newInterval-->[3,10] Intervals-->[12,16] 
    do dry run on testcase 2 you will get it at last iteration

And third else for,
    ye to overlapping ko tackle krne k liye hai ....to jo v interval and newInterval ka first value me se chota hoga wo first value hoga and jo second value me se bada value hoga wo second value hoga
    for e.g.--> Interval-->[3,5] newInterval-->[4,8]
                min(3,4)
                max(5,8)
                    new answer will be (3,8)


*/
