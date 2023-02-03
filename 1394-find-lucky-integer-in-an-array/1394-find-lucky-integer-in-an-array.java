class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       System.out.print(map);
       for(int i=arr.length-1;i>=0;i--){
           if(arr[i]==map.get(arr[i]))return arr[i];
       }
        return -1;
    }
}