class Solution {
    public int kthFactor(int n, int k) {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0)list.add(i);
        }
        //System.out.print(list);
        list.add(list.size(),n);
       
       return list.size()>=k? list.get(k-1):-1;
    }
}