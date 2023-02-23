class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        
        List<List<Integer>>res=new ArrayList<>();
        HashMap<Integer,List<Integer>>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int size=arr[i];
            // if absent then put into map
            map.putIfAbsent(size,new ArrayList());
            if(map.get(size).size()==size){
                // here i insert the list into map value because if we dont do this then suppose a condition occurs like first testcase where most of the elements are same and we must have to empty the list all the time when size will equal . So the first list will be lost when we will do the list empty of the same size 
                res.add(map.get(size));
                // make the map empty when the size is equal
                map.put(size,new ArrayList());
            }
            // indexes adding in the list
            map.get(size).add(i);
        }
        // adding all the values
        res.addAll(map.values());
        return res;
    }
}