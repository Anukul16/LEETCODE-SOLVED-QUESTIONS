class Solution {
    public long numberOfWeeks(int[] milestones) {
       long totalSum=0;
       long maxValue=0;
       for(int milestone:milestones){
           totalSum+=milestone;
           maxValue=Math.max(maxValue,milestone);
       }
       long sumExceptMaxValue=totalSum-maxValue;
       if(maxValue>sumExceptMaxValue){
           return 2*sumExceptMaxValue+1;
       }
       return totalSum;
    }
}