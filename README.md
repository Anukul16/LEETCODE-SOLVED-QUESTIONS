# LEETCODE-SOLVED-QUESTIONS
Collection of LeetCode questions to ace the coding interview! - Created using [LeetHub](https://github.com/QasimWani/LeetHub)





**LUCKY NUMBER IN A MATRIX 

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
       List<Integer>list=new ArrayList();
       int m=matrix.length;
       int n=matrix[0].length;

       int minEleInEachRow[]=new int[m];
       int maxEleInEachCol[]=new int[n];

       
       for(int i=0;i<m;i++ ){
           int min=Integer.MAX_VALUE;
           for(int j=0;j<n;j++){
               min=Math.min(min,matrix[i][j]);
           }
            minEleInEachRow[i]=min;
       }

       for(int i=0;i<n;i++ ){
         int max=Integer.MIN_VALUE;
           for(int j=0;j<m;j++){
               max=Math.max(max,matrix[j][i]);
           }
            maxEleInEachCol[i]=max;
       }

        for(int i=0;i<minEleInEachRow.length;i++){
            for(int j=0;j<maxEleInEachCol.length;j++){
                if(minEleInEachRow[i]==maxEleInEachCol[j]){
                    list.add(minEleInEachRow[i]);
                    break;
                }
            }
        }
        return list;

    }
}
