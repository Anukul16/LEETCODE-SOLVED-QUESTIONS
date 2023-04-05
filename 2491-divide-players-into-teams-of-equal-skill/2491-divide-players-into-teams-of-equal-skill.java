class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long ans=0;
        int st=0,end=skill.length-1;
        boolean isTrue=true;
        int sum=0;
        while(st<=end){
            if(sum==skill[st]+skill[end] || isTrue==true){
                sum=skill[st]+skill[end];
                isTrue=false;
            }else{
                return -1;
            }
            ans=ans+skill[st]*skill[end];
            st++;end--;

        }
        return ans;
    }
}