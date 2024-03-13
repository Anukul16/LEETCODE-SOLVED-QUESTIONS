class Solution {
    public int pivotInteger(int n) {
       
       int psum[]=new int[n+1];
       psum[0]=0;
       for(int i=1;i<=n;i++){
            psum[i]=i+psum[i-1];
       }
    //    System.out.println(Arrays.toString(psum));
       for(int i=1;i<psum.length;i++){
            if(psum[psum.length-1]-psum[i]==psum[i-1]){
                return i;
            }
       }
       return -1;
    }
}