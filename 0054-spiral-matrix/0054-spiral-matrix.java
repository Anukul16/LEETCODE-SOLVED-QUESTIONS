class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // see notes section for notes
        List<Integer>ans=new ArrayList<>();
        int top=0,left=0,bottom=matrix.length-1,right=matrix[0].length-1,direction=0;
        while(top<=bottom && left<=right){
            if(direction==0){
                for(int i=left;i<=right;i++){
                    ans.add(matrix[top][i]);
                }
                top++;
            }else if(direction==1){
                for(int i=top;i<=bottom;i++){
                    ans.add(matrix[i][right]);
                }
                right--;
            }else if(direction==2){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }else if(direction==3){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;

            }
            direction=(direction+1)%4;

        }
        return ans;
    }
}
