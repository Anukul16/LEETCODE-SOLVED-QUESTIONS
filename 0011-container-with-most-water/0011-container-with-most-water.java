class Solution {
    public int maxArea(int[] height) {
        int ans=Integer.MIN_VALUE;
        int left=0,right=height.length-1;
        while(left<right){
            int cal=(right-left)*Math.min(height[left],height[right]);
            ans=Math.max(ans,cal);
            if(height[left]<height[right])left++;
            else right--;
        }
        return ans;
    }
}

