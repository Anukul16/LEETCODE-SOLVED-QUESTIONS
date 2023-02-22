class Solution {
    public List<String> printVertically(String s) {
        String arr[]=s.split(" ");
        List<String>list=new ArrayList();
        int col=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            char ch[]=arr[i].toCharArray();
            col=Math.max(col,ch.length);
        }
        int row=arr.length;

        // System.out.print("Row: "+row+" "+"Col: "+col);
        // System.out.println(arr[0]);
        
        char mat[][]=new char[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                mat[i][j]=arr[i].charAt(j);
            }
        }
        
        for(int i=0;i<col;i++){
            String res="";
            for(int j=0;j<row;j++){
                if(i>arr[j].length()-1)res+=" ";
                else res+=arr[j].charAt(i);
            }
            list.add(res.stripTrailing());
        }
    
       

        return list;
    }
}