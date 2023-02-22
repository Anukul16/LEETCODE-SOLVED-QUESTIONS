//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        
        ArrayList<Integer>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        findSum(0,arr,ans,list);
        return ans;
    }
    public void findSum(int idx,ArrayList<Integer>arr,ArrayList<Integer>ans,List<Integer>list){
        if(idx==arr.size()){
            ans.add(sum(list));
            return;
        }
        list.add(arr.get(idx));
        findSum(idx+1,arr,ans,list);
        list.remove(list.size()-1);
        findSum(idx+1,arr,ans,list);
    }
    public int sum(List<Integer>list){
        int s=0;
        for(int x:list)s+=x;
        return s;
    }
}