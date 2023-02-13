class Solution {
    
    public int countOdds(int low, int high) {
        if(low>high)return 0;
        else if(high%2!=0)return 1+ countOdds(low,high-1);
        else if(low%2!=0)return 1+ countOdds(low+1,high);
        
        return (high-low)/2;
    }
}