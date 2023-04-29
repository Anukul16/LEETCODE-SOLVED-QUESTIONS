class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int n=A.length;
       int[]ans=new int[n];
       int a[]=new int[100];
       int count=0;
       for(int i=0;i<n;i++){
           a[A[i]]++;
           if(a[A[i]]>1)count++;
           a[B[i]]++;
           if(a[B[i]]>1)count++;
           ans[i]=count;
       }
       return ans;
    }
}