class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       System.out.print(map);
       int max_key=Integer.MIN_VALUE;
       int returning=0;
       for(int num:map.keySet()){
           if(num>max_key){
               max_key=num;
             if(max_key==map.get(max_key))returning=max_key;  
           }
       }
       
        return returning!=0?returning:-1;





    //     HashMap<Integer,Integer>map=new HashMap();
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length;i++){
    //         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    //     }
    //    System.out.print(map);
    //    for(int i=arr.length-1;i>=0;i--){
    //        if(arr[i]==map.get(arr[i]))return arr[i];
    //    }
    //     return -1;
    }
}