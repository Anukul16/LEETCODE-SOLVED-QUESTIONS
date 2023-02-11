class Solution {
    public int[] replaceElements(int[] arr) {
        int result[]=new int[arr.length];
        
        int max=-1;
        result[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            result[i]=Math.max(max,arr[i+1]);
            max=result[i];
        }
        // for(int i=0;i<arr.length;i++){
        //     int max=-1;
        //     for(int j=i+1;j<arr.length;j++){
        //         max=Math.max(max,arr[j]);
        //     }
        //     result[i]=max;
        // }
        return result;
    }
}