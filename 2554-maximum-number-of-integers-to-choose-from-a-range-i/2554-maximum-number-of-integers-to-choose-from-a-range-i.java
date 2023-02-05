class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
      
      Set<Integer>ban=new HashSet();
      for(int x:banned){
          ban.add(x);
      }
        int count=0;
      for(int i=1;i<=n;i++){
          if(!ban.contains(i) && i<=maxSum){
              count++;
              maxSum-=i;
          }
      }
      return count;
    }
}