class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int temp[]=arr.clone();
       Arrays.sort(arr);
        int count=0;
       HashMap<Integer,Integer>map=new HashMap();

       for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i]));
               count++;

           }else{
               map.put(arr[i],i+1-count);
           }
       }
       for(int i=0;i<temp.length;i++){
           arr[i]=map.get(temp[i]);
       }
       //System.out.print(map);
       return arr;

    }
}