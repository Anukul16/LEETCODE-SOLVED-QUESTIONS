class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        int n = plantTime.length;

        int[][] arr = new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0] = plantTime[i];
            arr[i][1] = growTime[i];
        }

        Arrays.sort(arr, (a,b)->b[1]-a[1]);

        int bloomDay = 0, lastPlantDay = 0;

        for(int i=0;i<n;i++){
            bloomDay = Math.max(bloomDay, lastPlantDay+arr[i][0]+arr[i][1]);
            lastPlantDay = lastPlantDay + arr[i][0];
        }

        return bloomDay;




    //     Map<Integer,Integer>map=new HashMap<>();
    //     for(int i=0;i<plantTime.length;i++){
    //         map.put(plantTime[i],growTime[i]);
    //     }
    //     Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
    //     map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

    // int maxBloomDays=0;
    // int prevPlantDays=0;
    // for(int i=0;i<plantTime.length;i++){
    //     int currPlantTime=plantTime[i];
    //     int currGrowTime=growTime[i];

    //     prevPlantDays+=currPlantTime;
    //     int currPlantBloomTime=prevPlantDays+currGrowTime;
    //     maxBloomDays=Math.max(maxBloomDays,currPlantBloomTime);
    // }
    // return maxBloomDays;

    }
}