class Solution {
    public int splitNum(int num) {
       String s=String.valueOf(num);
       char arr[]=s.toCharArray();
       Arrays.sort(arr);
       String num1="",num2="";
       for(int i=0;i<arr.length;i++){
           if(i%2==0)num1+=arr[i];
           else num2+=arr[i];
       }
       Integer n1=Integer.valueOf(num1);
       Integer n2=Integer.valueOf(num2);
       return n1+n2;
    }
}