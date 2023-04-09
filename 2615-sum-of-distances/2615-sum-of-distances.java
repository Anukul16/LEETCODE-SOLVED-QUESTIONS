class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],new ArrayList<>());
            }
             map.get(nums[i]).add(i);//{1=[0, 2, 3], 2=[4], 3=[1]}
        }
        long[]ans=new long[nums.length];
        for(Map.Entry<Integer,ArrayList<Integer>>entry:map.entrySet())
        {
            if(entry.getValue().size()==1)
            {
                continue;
            }
            ArrayList<Integer>list=entry.getValue();
            // System.out.print(list);
            long[]prefix_Sum_Array=new long[list.size()];
            long sum=0;
            int len=prefix_Sum_Array.length;
            for(int i=0;i<len;i++)
            {
                sum+=list.get(i);
                prefix_Sum_Array[i]=sum;
            }
            for(int i=0;i<len;i++)
            {
                int  currIndex=list.get(i);
                long prefix_Sum=i>0?prefix_Sum_Array[i-1]:0;
                long currSum=prefix_Sum_Array[i];
                long suffix_Sum=prefix_Sum_Array[len-1]-currSum;
                long left_side_element=i,right_side_element=len-(i+1);
                ans[currIndex]=(left_side_element*currIndex-(prefix_Sum)) + suffix_Sum-(right_side_element*currIndex);
            }
        }
        // System.out.print(map);
        return ans;
    }
}