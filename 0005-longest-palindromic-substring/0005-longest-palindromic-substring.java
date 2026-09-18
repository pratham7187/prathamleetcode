class Solution {

        public String pali(String s,int i,int j){
            int n=s.length();
            while(i>=0&&j<n){
                if(s.charAt(i)==s.charAt(j)){
                    i--;
                    j++;
                }
                else{
                    break;
                }
            }
                 return s.substring(i+1,j);
            
        }

    public String longestPalindrome(String s) {
        String ans="";
        int n=s.length();
        for(int i=0;i<n;i++){
        String odd=pali(s,i,i);
        String even=pali(s,i,i+1);
        
            if (odd.length() > ans.length()) {
                ans = odd;
            }

            if (even.length() > ans.length()) {
                ans = even;
            }
    }

return ans;
    }
}