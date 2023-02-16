class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[]=isPrime(right);
        prime[0]=false;
        prime[1]=false;

        List<Integer>list=new ArrayList<>();
        int[]result=new int[]{-1,-1};
        for(int i=left;i<=right;i++){
            if(prime[i])list.add(i);
        }
       
        if(list.size()==2){
            int res[]={list.get(0),list.get(1)};
            return res;
        }
        int min=Integer.MAX_VALUE;
        
        if(list.size()>2){
            for(int i=0;i<list.size()-1;i++){
                int diff=Math.abs(list.get(i)-list.get(i+1));
                if(diff<min){
                    min=diff;
                    result[0]=list.get(i);
                    result[1]=list.get(i+1);
                }
            }
            return result;
        } 
        
        return result;
    }
    public static boolean[] isPrime(int n){
      boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) prime[i] = true;
        for (int p=2;p*p<= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
}
}