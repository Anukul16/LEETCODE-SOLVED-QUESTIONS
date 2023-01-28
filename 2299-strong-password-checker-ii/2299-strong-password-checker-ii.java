class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean isLC=false;
        boolean isUC=false;
        boolean isDigit=false;
        boolean isSC=false;

        if(password.length()>7){
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if((i<password.length()-1) && ch==password.charAt(i+1)){
                    return false;
                }
                if(ch>64 && ch<91){
                    isUC=true;
                }else if(ch>96 && ch<123){
                    isLC=true;
                }else if(ch>47 && ch<58){
                    isDigit=true;
                }else{
                    isSC=true;
                }
            }
        }
        if(isUC==true && isLC==true && isDigit==true && isSC==true)
            return true;
            
        return false;
    }
}